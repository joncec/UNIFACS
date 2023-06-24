package entities;

public class ColStudent extends Student {

private String discipline;

public ColStudent(int reg, String name, String discipline) {
    super(reg, name);
    setDiscipline(discipline);
}

public String getDiscipline() {
    return discipline;
}

public void setDiscipline(String discipline) {
    this.discipline = discipline;
}

@Override
public String toString() {
    return "College Student - Registration: " + getReg() + ", Name: " + getName() + ", Discipline: " + discipline;
}

}
