package main.java.classes;
//imports


public class LineItem {
    public static final String getTotal = null;
	//members
    int quantity;
    int quantityOrder;
    Product product;
    double total;

    //constructors
    public LineItem(
        int quantity, 
        Product product
    ) {
        setQuantity(quantity);
        setQuantityOrder(quantityOrder);
        setProduct(product);
        setTotal(total);
        calcTotal();
        updateStock();
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }
  
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    
    //total product amount (quantity of product * price of product)
    public void calcTotal(){
        setTotal(getProduct().getPrice()*getQuantity());//ArrayList(setTotal) * int need fixing
    }
    //product stock available after ordering
    public void updateStock(){
        setQuantity(getQuantity() - getQuantityOrder());
    }
    
     
}