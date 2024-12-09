package HW10;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle() {}

    public Circle(double radius) {
        invalidRadius(radius);
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        invalidRadius(radius);
    }
public void invalidRadius(double radius){
    if (radius > 0) {
        this.radius = radius;
    } else {
        this.radius = 1.0;
    }
}
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius value. Setting to default (1.0).");
            this.radius = 1.0;
        }
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
