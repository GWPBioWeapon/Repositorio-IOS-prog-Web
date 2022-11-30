
public class App_a2 {
    public static void main(String[] args) throws Exception {



        Aluno aluno1 = new Aluno("Isabella","90909090-1","1999","TER/QUI/SEX");
		Aluno aluno2 = new Aluno("Valentim","11001100-2","2001","SEG/TER/SEX");
        
        // ManipulaAlunos_m1.adicionaAluno(aluno1.dadosString(),"dadosAlunos.txt");
        // ManipulaAlunos_m1.adicionaAluno(aluno2.dadosString(),"dadosAlunos.txt");

        // ManipulaAlunos_m1.adicionaAluno(aluno1.dadosJSON(),"dadosAlunos.txt");
        // ManipulaAlunos_m1.adicionaAluno(aluno2.dadosJSON(),"dadosAlunos.txt");

        ManipulaAlunos_m2.adicionaAluno(aluno1.dadosJSON(),"dadosAlunos.json");
        ManipulaAlunos_m2.adicionaAluno(aluno2.dadosJSON(),"dadosAlunos.json");

        
    
    }
}
