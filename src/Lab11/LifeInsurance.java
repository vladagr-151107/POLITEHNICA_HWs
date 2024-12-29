package Lab11;

public class LifeInsurance extends Insurance{
    public LifeInsurance(String firstName, String lastName, String address){
        super(firstName, lastName, address);
    }
    public LifeInsurance(String firstName, String lastName, String address, String frequency){
        super(firstName, lastName, address, frequency);
    }
    @Override
    public void computeAmountPerPeriod(){
        if (this.frequency.equals("quarterly")) {
           this.amountPerPeriod *= 1.02;
        }
    }
}
