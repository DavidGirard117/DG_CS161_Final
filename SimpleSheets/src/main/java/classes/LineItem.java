package main.java.classes;
//imports
import java.util.ArrayList;

public class LineItem {
    public static final String getTotal = null;
	//members
    int quantity;
    int quantityAvail;
    int quantityOrder;
    Product product;
    double cost;
    ArrayList<LineItem> total;//was double; might need to revert back

    //constructors
    public LineItem(
        int quantity, 
        Product product, 
        double cost
    ) {
        setQuantityAvail(quantityAvail);
        setQuantityOrder(quantityOrder);
        setProduct(product);
        setCost(cost);
        calcTotal();
        updateStock();
    }

    public int getQuantityAvail() {
        return quantityAvail;
    }

    public void setQuantityAvail(int quantityAvail) {
        this.quantityAvail = quantityAvail;
    }
    public int getQuantityOrder(){
        return quantityOrder;
    }
    public void setQuantityOrder(int quantityOrder){
        this.quantityOrder = quantityOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setTotal(ArrayList<LineItem> total){
        this.total = total;
    }
    public ArrayList<LineItem> getTotal(){
        return total;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    //total product amount (quantity of product * price of product)
    public void calcTotal(double total){
        setTotal(getCost()*getQuantityOrder());//ArrayList * int need fixing
    }
    //product stock available after ordering
    public void updateStock(){
        setQuantity(getQuantityAvail() - getQuantityOrder());
    }
    
     
}