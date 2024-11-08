package HW6;

public class ProductTest {
    public static void main(String[] args){
        Product product1 = new Product("Crop top", 134000);
        Product product2 = new Product("Dress", 2300000);
        product1.displayProduct();
        product2.displayProduct();
        int increaseROL = (int) (10.25 * 10000);
        product1.setPrice((int) (product1.getPrice() + increaseROL));
        product1.setPrice(product1.getPrice() + increaseROL);
        product2.setPrice(product2.getPrice() + increaseROL);
        System.out.println("\nAfter price increase (in ROL):");
        product1.displayProduct();
        product2.displayProduct();
        System.out.println("\nPrices in RON:");
        System.out.printf("Product: %s, Price: %s RON\n", product1.getName(), product1.getPriceRON());
        System.out.printf("Product: %s, Price: %s RON\n", product2.getName(), product2.getPriceRON());
    }
}
