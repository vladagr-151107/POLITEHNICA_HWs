package HW8;

class Point extends Form {
    private int x, y;
    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public double computeArea() {
        return 0;
    }
    @Override
    public double computeVolume() {
        return 0;
    }
    @Override
    public String toString() {
        return "Point at (" + x + ", " + y + ")";
    }
}