
package model.bean;

public class Funcionario {

    String CPF, nome, RG, dtNascimento;
    
    public Funcionario (){
    
    }

    public Funcionario(String CPF, String nome, String RG, String dtNascimento) {
        this.CPF = CPF;
        this.nome = nome;
        this.RG = RG;
        this.dtNascimento = dtNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
   
}
