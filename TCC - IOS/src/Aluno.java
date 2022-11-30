public class Aluno {

    private String nomeProf;
    private String areaProf;
    private String telWP;
    private String diaDisp;

    Aluno(String nome, String area, String tel, String diaSem) {
        this.nomeProf = nome;
        this.areaProf = area;
        this.telWP = tel;
        this.diaDisp = diaSem;
    }

    

    public String dadosString() {
        String atr1 = "Nome: " + this.nomeProf;
        String atr2 = "Área de atuação: " + this.areaProf;
        String atr3 = "Telefone: " + this.telWP;
        String atr4 = "Dias da Semana disponível: " + this.diaDisp;
        return "\n" + atr1 + "\n" + atr2 + "\n" + atr3 + "\n" + atr4 + "\n";
    }
    
    public String dadosJSON() {        
        String atr1 = "\"nomeProf\" : \"" + this.nomeProf + "\" ,";
        String atr2 = "\"areaProf\" : \"" + this.areaProf + "\" , ";
        String atr3 = "\"telWP\" : \"" + this.telWP + "\"";
        String atr4 = "\"diaDisp\" : \"" + this.diaDisp + "\"";
        return "{" + atr1 + atr2 + atr3 + atr4 + "}";
    }
}