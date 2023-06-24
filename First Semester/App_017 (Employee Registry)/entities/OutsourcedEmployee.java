package entities;

public class OutsourcedEmployee extends Employee {
    private static final double BONUS_RATE = 1.10;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, double hours, double hourlyRate) {
        super(name, hours, hourlyRate);
    }

    @Override
    public double payment() {
        return super.payment() * BONUS_RATE;
    }
}
