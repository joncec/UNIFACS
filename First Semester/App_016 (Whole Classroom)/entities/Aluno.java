package entities;

public class Aluno extends Person {
    private String curso;

    public Aluno() {
        super();
        curso = "Baboonga????";
    }

    public Aluno(String nome, String CPF, String curso) {
        super(nome, CPF);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Curso: " + curso + "\n";
        return s;
    }
}