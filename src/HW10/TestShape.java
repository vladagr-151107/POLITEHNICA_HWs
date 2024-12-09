package HW10;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Circle:");
        Circle circle1 = new Circle(5);
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        System.out.println("\nRectangle:");
        Rectangle rectangle1 = new Rectangle(5, 3);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("\nSquare:");
        Square square1 = new Square(8);
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
    }
}

