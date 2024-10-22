package ThirdHW;

public class Distance {
    public static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 4, y2 = 5;
        double dist = distance(x1, y1, x2, y2);
        System.out.println("The distance between point A(0,0) and point B(4,5) is: " + dist);
    }
}

