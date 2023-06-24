package entities;

public class Professor extends Person {
    private String area;

    public Professor(String nome, String CPF, String area) {
        super(nome, CPF);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Área: " + area + "\n";
        return s;
    }
}