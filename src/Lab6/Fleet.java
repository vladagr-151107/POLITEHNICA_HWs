package Lab6;

public class Fleet {
    private Car town;
    private Car suv;
    public Fleet(double Car1StartOdo, double Car1EndOdo, double Car1Liters, double Car2StartOdo, double Car2EndOdo, double Car2Liters){
        this.town = new Car(Car1StartOdo,Car1EndOdo, Car1Liters);
        this.suv = new Car(Car2StartOdo,Car2EndOdo, Car2Liters);
    }
    public double averageConsumption(){
        double townConsumption = town.computeConsumption();
        double suvConsumption = suv.computeConsumption();
        return (townConsumption + suvConsumption) / 2;
    }
}
