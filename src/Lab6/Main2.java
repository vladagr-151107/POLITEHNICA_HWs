package Lab6;

public class Main2 {
    public static void main(String[] args) {
        Fleet fleet = new Fleet(1000, 1500, 50, 900, 1500, 100);
        System.out.printf("Average Fleet Fuel Consumption: %.2f liters/100km%n", fleet.averageConsumption());
    }
}
