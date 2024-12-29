package Lab11;

public class VideoCard extends HardwareProduct{
    protected String currency;
    protected int maximumScore = 100;
    public VideoCard(double currencyPrice, double score){
        super(currencyPrice, score);
    }
    public void computePriceInLei(){}
    @Override
    public void computePerformance(){
        this.performance = (score / maximumScore) * 100;
    }
}
