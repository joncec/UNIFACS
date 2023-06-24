package entities;

public class Employee {
    private String name;
    private double hours;
    private double hourlyRate;

    public Employee() {
        name = "Channeslcleya";
        hours = 1;
        hourlyRate = 1;
    }

    public Employee(String name, double hours, double hourlyRate) {
        setName(name);
        setHours(hours);
        setHourlyRate(hourlyRate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double payment() {
        return hours * hourlyRate;
    }
}
