package HW5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle and x,y.");
        double r = scanner.nextDouble();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Circle circle = new Circle(r,x,y);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
