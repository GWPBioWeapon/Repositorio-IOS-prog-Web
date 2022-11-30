import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App_a1 {
    public static void main(String[] args) throws Exception {


        Aluno aluno1 = new Aluno("Isabella","90909090-1","1999","TER/QUI/SEX");
        Aluno aluno2 = new Aluno("Valentim","11001100-2","2001","SEG/TER/SEX");


        File arquivo = new File( "dadosAlunos.txt" );
        FileWriter arquivoEscrita = new FileWriter( arquivo ,true);
        BufferedWriter conteudo = new BufferedWriter( arquivoEscrita );
        
        conteudo.append( aluno1.dadosString() );
        conteudo.append( aluno2.dadosString() );
        conteudo.close( );
        
    
    }
}
