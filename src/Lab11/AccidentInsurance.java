package Lab11;

public class AccidentInsurance extends Insurance{
    public AccidentInsurance(String firstName, String lastName, String address){
        super(firstName, lastName, address);
    }
    public AccidentInsurance(String firstName, String lastName, String address, String frequency){
        super(firstName, lastName, address, frequency);
    }
    @Override
    public void computeAmountPerPeriod(){
        if (this.frequency.equals("half-yearly")) {
            this.amountPerPeriod *= 1.05;
        }
    }
}
