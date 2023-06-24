package entities;

public class HiScStudent extends Student {

private int year;

public HiScStudent(int reg, String name, int year) {
    super(reg, name);
    setYear(year);
}

public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}

@Override
public String toString() {
    return "High School Student - Registration: " + getReg() + ", Name: " + getName() + ", Year: " + year;
}
}
