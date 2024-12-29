package Lab11;

public class HardwareProduct {
    private double currencyPrice;
    private double leiPrice;
    protected double score;
    protected double performance;
    public HardwareProduct(double currencyPrice, double score){
        this.currencyPrice = currencyPrice;
        this.score = score;
    }
    public void computePerformance(){}
    public void computePriceInLei(double currencyRate) {
        this.leiPrice = this.currencyPrice * currencyRate;
    }
    public double computeRatioLeiPerformance(){
        return Math.round(leiPrice / performance);
    }
    @Override
    public String toString() {
        return "HardwareProduct: \n" +
                "Price in Lei is " + leiPrice +
                "\n Ratio is " + computeRatioLeiPerformance() +
                "\nPerformance is " + performance;
    }
}
