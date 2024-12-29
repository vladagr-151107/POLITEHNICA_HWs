package Lab11;

public abstract class Insurance {
    private static int id = 1;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    protected double amountPerPeriod;
    protected String frequency;
    private double sum;
    public Insurance(String firstName, String lastName, String address){
        this.number = id++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.amountPerPeriod = 13;
        this.frequency = "monthly";
        this.sum = 0;
    }
    public Insurance(String firstName, String lastName, String address, String frequency){
        this.number = id++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.frequency= frequency;
        this.amountPerPeriod = 13;
        this.sum = 0;
    }
    public abstract void computeAmountPerPeriod();
    public void computeSum(){
        sum += amountPerPeriod;
    }
    public double getSum(){
        return sum;
    }
    public String getFrequency(){
        return frequency;
    }
    public String toString(){
        return "Insurance Policy Number: " + number + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + address + "\n" +
                "Payment Frequency: " + frequency + "\n" +
                "Amount Per Period: " + amountPerPeriod + "\n" +
                "Total Sum Paid: " + sum;
    }
}
