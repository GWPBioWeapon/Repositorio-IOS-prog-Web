import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App_a1 {
    public static void main(String[] args) throws Exception {


        Funcionario item1 = new Funcionario("Isabella","Ansiedade","(11) 98139-4108","TER/QUI/SEX");
        Funcionario item2 = new Funcionario("Valentim","Ansiedade","(11) 97268-3729","SEG/TER/QUI");
        Funcionario item3 = new Funcionario("Matheus","Ansiedade","(11) 98611-5701","SEG/TER/QUA");


        File arquivo = new File( "dadosAlunos.txt" );
        FileWriter arquivoEscrita = new FileWriter( arquivo ,true);
        BufferedWriter conteudo = new BufferedWriter( arquivoEscrita );
        
        conteudo.append( item1.dadosString() );
        conteudo.append( item2.dadosString() );
        conteudo.append( item3.dadosString() );
        conteudo.close( );
        
    
    }
}
