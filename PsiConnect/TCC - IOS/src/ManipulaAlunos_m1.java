import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ManipulaAlunos_m1 {


    static void adicionaAluno(String dadosAluno, String nomeArquivo) throws IOException {

        File arquivo = new File( nomeArquivo );
        FileWriter arquivoEscrita = new FileWriter( arquivo ,true);
        BufferedWriter conteudo = new BufferedWriter( arquivoEscrita );
        
        conteudo.write( dadosAluno );
        conteudo.close( );

    }


}
