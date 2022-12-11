import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ManipulaFuncionarios_m1 {


    static void adicionaFuncionario(String dadosFuncionario, String nomeArquivo) throws IOException {

        File arquivo = new File( nomeArquivo );
        FileWriter arquivoEscrita = new FileWriter( arquivo ,true);
        BufferedWriter conteudo = new BufferedWriter( arquivoEscrita );
        
        conteudo.write( dadosFuncionario );
        conteudo.close( );

    }


}
