package HW8;

class Cylinder extends Circle {
    private int height;
    public Cylinder() {
        this(0, 0, 0, 0);
    }
    public Cylinder(int height, int radius, int x, int y) {
        super(radius, x, y);
        this.height = height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double computeArea() {
        int radius = getRadius();
        return 2 * Math.PI * radius * (radius + height);
    }
    @Override
    public double computeVolume() {
        int radius = getRadius();
        return Math.PI * radius * radius * height;
    }
    @Override
    public String toString() {
        return "Cylinder with height " + height + " and " + super.toString();
    }
}
