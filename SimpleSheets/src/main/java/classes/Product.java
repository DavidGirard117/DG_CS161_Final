package main.java.classes;

public class Product {
        //members
        String name;
        double price;
        int quantityAvail;
        int quantityOrder;
        int productID;

    //constructors
    public Product(
        String name,
        double price,
        int quantityAvail,
        int productID
        ) {
        setName(name);
        setPrice(price);
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
    
    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
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

    public int getQuantity() {
        return quantityAvail;
    }

    public void setQuantity(int quantity) {
        this.quantityAvail = quantity;
    }


    
}