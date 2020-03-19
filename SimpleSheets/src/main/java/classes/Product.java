package main.java.classes;

public class Product {
    //members
    String name;
    double price;
    int stock;
    //int quantity;
    int productID;

    //constructors
    public Product(String name, double price, int stock, int productID) {
        setName(name);
        setPrice(price);
        setStock(stock);
        setProductID(productID);
        //updateStock(quantity);
    }
    

    // operations
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    //add stock to inventory
    //public void updateStock(int quantity){
        //setStock(getStock() + quantity); 
    //}
    

    
}