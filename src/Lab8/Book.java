package Lab8;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock){
        this.price = price;
        this.author = author;
        this.qtyInStock = qtyInStock;
        this.name = name;
    }
    public Book(String name, Author author, double price){
        this.price = price;
        this.author = author;
        this.qtyInStock = 0;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setQtyInStock(){
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString(){
        return name + " by " + author;
    }
}
