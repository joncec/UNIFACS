package entities;

public class Student {

private int reg;
private String name;

public Student(int reg, String name) 
{
    this.reg = reg;
    this.name = name;
}

public int getReg() {
    return reg;
}
public void setReg(int reg) {
    this.reg = reg;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return "Student - Registration: " + reg + ", Name: " + name;
}

}
