package HW11;

public class Main {
    public static void main(String[] args){
        Ball ball1 = new Football("spalding");
        Ball ball2 = new Football("Spalding");
        try {
            Baseball baseball = (Baseball) ball1;
            System.out.println("Line 3 works!");
        } catch (ClassCastException e) {
            System.out.println("Line 3 fails at runtime: " + e);
        }
        Object obj1 = new Baseball("spalding");
        Object obj2 = new Baseball("spalding");
        // Tossable tossable = obj2;  it will cause compilation error
        Tossable tossable = new Baseball("spalding");
        Object obj = tossable;
    }
}

