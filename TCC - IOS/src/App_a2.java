
public class App_a2 {
    public static void main(String[] args) throws Exception {



        Funcionario item1 = new Funcionario("Isabella","Ansiedade","(11) 98139-4108","TER/QUI/SEX");
		Funcionario item2 = new Funcionario("Valentim","Ansiedade","(11) 97268-3729","SEG/TER/QUI");
        Funcionario item3 = new Funcionario("Matheus","Ansiedade","(11) 98611-5701","SEG/TER/QUA");
        
        ManipulaFuncionarios_m1.adicionaFuncionario(item1.dadosString(),"dadosAlunos.txt");
        ManipulaFuncionarios_m1.adicionaFuncionario(item2.dadosString(),"dadosAlunos.txt");
        ManipulaFuncionarios_m1.adicionaFuncionario(item3.dadosString(),"dadosAlunos.txt");

        ManipulaFuncionarios_m1.adicionaFuncionario(item1.dadosJSON(),"dadosAlunos.txt");
        ManipulaFuncionarios_m1.adicionaFuncionario(item2.dadosJSON(),"dadosAlunos.txt");
        ManipulaFuncionarios_m1.adicionaFuncionario(item3.dadosJSON(),"dadosAlunos.txt");

        ManipulaFuncionarios_m2.adicionaFuncionario(item1.dadosJSON(),"dadosAlunos.json");
        ManipulaFuncionarios_m2.adicionaFuncionario(item2.dadosJSON(),"dadosAlunos.json");
        ManipulaFuncionarios_m2.adicionaFuncionario(item3.dadosJSON(),"dadosAlunos.json");

        
    
    }
}
