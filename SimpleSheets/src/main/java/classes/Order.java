package main.java.classes;
import java.util.ArrayList;
import java.time.LocalDate;

public class Order {
    //members
    LocalDate date;
    int number;
    Customer customerID;
    Customer customerName;
    Employee employeeName;
    boolean orderStatus;
    Address billingAddress;
    Address shippingAddress;
    double total;
    ArrayList<Employee> comission;
    ArrayList<LineItem> lineItems;

    //constructor
    public Order(int number, 
    Customer customer, 
    Employee employee, 
    boolean orderStatus,
    ArrayList<LineItem> lineItems,
    ArrayList<Employee> comission
    
    ){
        LocalDate hireDate = LocalDate.now();
        setDate(hireDate);
        setNumber(number);
        //setEmployeeName(employee.getFullName());
        //setCustomerID(customer.getIDNumber());
        //setCustomerName(getFullName());
        setOrderStatus(orderStatus);//True or False
        setBillingAddress(customer.getBillingAddress());
        setShippingAddress(customer.getShippingAddress());
        setTotal(total);  
        calcTotal(lineItems);
        setComission(comission);
        setLineItems(lineItems);
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

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public Employee getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(Employee employeeName) {
        this.employeeName = employeeName;
    }

    public boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
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
    public ArrayList<Employee> getComission(){
        return comission;
    }
    public void setComission(ArrayList<Employee> comission){
        this.comission = comission;
    }
    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }
    
    //sum of LineItem totals
    public void calcTotal(ArrayList<LineItem>lineItems){
        for(LineItem item : lineItems){
            setTotal(item.getTotal()+getTotal());
        }
    
    }
    //Array list of comission amounts
    public void calcComission(ArrayList<Employee>totalComission){
        for(Employee comission : totalComission) {
            setComission(comission.getComissionRate()*getTotal());
        }
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
        sb.append("\r\n" + "Billing Address: "+getBillingAddress());
        sb.append("\r\n" + "Shipping Address: "+getShippingAddress());
    }
        //Line Item order information
        public void printLineItems(){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < lineItems.size(); i++){
                sb.append("\r\n" + "Amount: "+ lineItems.get(i).getQuantityOrder());
                sb.append("\r\n" + "Product: "+ lineItems.get(i).getProduct().getName());
                sb.append("\r\n" + "Price: "+ lineItems.get(i).getProduct().getPrice());
                sb.append("\r\n" + "Total: "+ lineItems.get(i).getTotal());
                sb.append("\r\n" + "Order Total: "+ getTotal());
                sb.append("\r\n" + "Sales Comission Amount: "+ getComission());



                



            }
        }

        







        


    
    

}

    
    
   /*  public int generateId() {
        for (var i = 0; i < order.length; i++) {
            number = Date.now();
            return number;
        } */
     
    
    

    
