package HW5;
public class Circle {
    private int x;
    private int y;
    private double radius;
    public Circle(double r, int x, int y){
        this.radius = r;
        this.x = this.x;
        this.y = y;
    }
    public double getArea(){
       return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return Math.PI * radius * 2;
    }
}
