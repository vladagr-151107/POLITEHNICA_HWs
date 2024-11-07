package Lab6;

public class Car {
    private double startKm;
    private double endKm;
    private double liters;
    public Car(double startOdo, double endOdo, double litersUsed){
        this.startKm = startOdo;
        this.endKm = endOdo;
        this.liters = litersUsed;
    }
    public double computeConsumption(){
        double distance = endKm - startKm;
        double consumption = (liters / distance) * 100;
        return(consumption);
    }
}
