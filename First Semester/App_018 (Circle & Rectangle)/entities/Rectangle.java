package entities;

public class Rectangle extends GeometricShape {
    private double height;
    private double length;

    public Rectangle() {

    }

    public Rectangle(Color color, double height, double length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return height * length;
    }
}
