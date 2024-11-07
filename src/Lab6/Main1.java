package Lab6;

public class Main1 {
public static void main(String[] args){
    Car car1 = new Car(1000,1500,50);
    System.out.printf("Car fuel consumption: %.2f liters/100km%n", car1.computeConsumption());
    Car car2 = new Car(900,1500,100);
    System.out.printf("Car fuel consumption: %.2f liters/100km%n", car2.computeConsumption());
}
}
