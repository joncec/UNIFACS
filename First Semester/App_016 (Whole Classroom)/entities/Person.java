package entities;

public class Person {
    private String nome;
    private String CPF;

    public Person() {
        nome = "Hugh Janus";
        CPF = "0000000000";
    }

    public Person(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        String g = "";
        g += "Nome: " + nome + "\n";
        g += "CPF: " + CPF + "\n";
        return g;
    }
}