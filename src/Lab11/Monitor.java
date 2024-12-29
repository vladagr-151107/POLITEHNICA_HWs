package Lab11;

public class Monitor extends HardwareProduct{
    protected String currency;
    protected int maximumScore = 150;
    public Monitor(double currencyPrice, double score){
        super(currencyPrice, score);

    }
    public void computePriceInLei(){}
    @Override
    public void computePerformance(){
        this.performance = (score / maximumScore) * 150;
    }
}
