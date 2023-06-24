package entities;

public abstract class GeometricShape {
    private Color color;

    public GeometricShape() {

    }

    public GeometricShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
