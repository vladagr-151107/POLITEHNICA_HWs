package HW6;

public class Product {
    private String name;
    private double priceROL;
    public Product(String name, double price){
        this.name = name;
        this.priceROL = price;
    }
    public String getName(){
        return name;
    }
    public void displayProduct(){
        System.out.printf("Name of product: %s and a price: %s \n", name,priceROL);
    }
    public double getPrice(){
        return priceROL;
    }
    public void setPrice(double priceROL){
        this.priceROL = priceROL;
    }
    public double getPriceRON(){
        return priceROL/10000;
    }
    public void setPriceRON(double priceInRON){
        this.priceROL = Math.round(priceInRON * 10000);
    }
}
