package HW8;

class Circle extends Point {
    private int radius;
    public Circle() {
        this(0, 0, 0);
    }
    public Circle(int radius, int x, int y) {
        super(x, y); // Call the Point constructor
        this.radius = radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double computeVolume() {
        return 0;
    }
    public int getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle with radius " + radius + " at " + super.toString();
    }
}
