


package main.java.classes;
import java.util.ArrayList;
import java.time.LocalDate;

public class Order {
    //members
    LocalDate date;
    int number;
    int customerID;
    String customerName;
    String employeeName;
    Employee employee;
    String orderStatus;
    Address billingAddress;
    Address shippingAddress;
    double total;
    double commission;
    ArrayList<LineItem> lineItems;

    //constructor
    public Order(
    int number, 
    Customer customer, 
    Employee employee, 
    String orderStatus,
    ArrayList<LineItem> lineItems,
    double commission
    ){
        LocalDate hireDate = LocalDate.now();
        setDate(hireDate);
        setNumber(number);
        setCustomerID(customer.getIDNumber());
        setCustomerName(customer.getFullName());
        setEmployeeName(employee.getFullName());
        setOrderStatus(orderStatus);//True or False
        setBillingAddress(customer.getBillingAddress());
        setShippingAddress(customer.getShippingAddress());
        //setCommission(employee.getCommissionRate());
        setLineItems(lineItems);  
        calcTotal();
        calcCommission(employee.getCommissionRate());
    }
    
    //operations
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public double getCommission(){
        return commission;
    }
    public void setCommission(double commission){
        this.commission = commission;
    }
    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
    
    //sum of LineItem totals
    public void calcTotal(){
        for(LineItem item : getLineItems()){
            setTotal(item.getTotal()+getTotal());
        }
    
    }
    //Array list of commission amounts
    public void calcCommission(double commissionRate){ 
        setCommission(employee.getCommissionRate()*getTotal());
    }
        //print order information
        public void printOrder(){
            StringBuilder sb = new StringBuilder();
                sb.append("Order Number: "+getNumber());
                sb.append("\r\n" + "Order Date: "+getDate());
                sb.append("\r\n" + "Customer Number: "+getCustomerID());
                sb.append("\r\n" + "Sales Associate: "+getEmployeeName());
                sb.append("\r\n" + "Customer Name: "+getCustomerName());
                sb.append("\r\n" + "Status: "+getOrderStatus());
                sb.append("\r\n" + "Billing Address: "+getBillingAddress().formatAddress());
                sb.append("\r\n" + "Shipping Address: "+getShippingAddress().formatAddress());
                System.out.println(sb.toString());
    }
       
        //Line Item order information
        public void printLineItems(){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < lineItems.size(); i++){
                sb.append("\r\n" + "Amount: "+ lineItems.get(i).getQuantity());
                sb.append("\r\n" + "Product: "+ lineItems.get(i).getProduct().getName());
                sb.append("\r\n" + "Price: "+ lineItems.get(i).getProduct().getPrice());
                sb.append("\r\n" + "Total: "+ lineItems.get(i).getTotal());
                sb.append("\r\n" + "Order Total: "+ getTotal());
                System.out.println(sb.toString());
            }
        }
}

    
    
   /*  public int generateId() {
        for (var i = 0; i < order.length; i++) {
            number = Date.now();
            return number;
        } */
     
    
    

    
