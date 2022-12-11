import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ManipulaFuncionarios_m2 {

    // remove a ultima virgula do arquivo e adiciona colcheteadiciona em uma estrutura JSON

    static void adicionaFuncionario(String dadosFuncionario, String nomeArquivo) throws IOException {


        File arquivo = new File( nomeArquivo ); // cria objeto com o nomeArquivo
        arquivo.createNewFile(); // cria arquivo caso não houver

        FileReader arquivoLeitura = new FileReader( arquivo );
        BufferedReader conteudoArquivoLeitura = new BufferedReader(arquivoLeitura);


        StringBuilder stringBuilder = new StringBuilder();
        String line = conteudoArquivoLeitura.readLine();


        if (line == null) {
            stringBuilder.append(dadosFuncionario);
            stringBuilder.insert(stringBuilder.length(), "]");
            stringBuilder.insert(0, "[");
        } 
        else {
            // atribui as linhas do arquivo a stringBuilder
            while (line != null) {
                stringBuilder.append(line);
                line = conteudoArquivoLeitura.readLine();
            }
            System.err.println(stringBuilder);
            
            // remove os colchetes
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(0);

            stringBuilder.append(",");
            stringBuilder.append(dadosFuncionario);
            stringBuilder.insert(stringBuilder.length(), "]");
            stringBuilder.insert(0, "[");

        }

        conteudoArquivoLeitura.close();
        String linhasEmString = stringBuilder.toString();

        

        FileWriter arquivoEscrita = new FileWriter( arquivo ,false);
        BufferedWriter conteudo = new BufferedWriter( arquivoEscrita );
        conteudo.write( linhasEmString );
        conteudo.close( );

    }


}
