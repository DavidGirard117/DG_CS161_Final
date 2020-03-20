package main.java.classes;
//import java. util.ArrayList;
public class Customer extends Person {

    //Members
    private Address billingAddress;
    private Address shippingAddress;
    
    //Constructors
    public Customer(int iDNumber, 
    String firstName, 
    String lastName, 
    String phoneNumber, 
    String eMail,
    Address billing,
    Address shipping
    //ArrayList<Address>addresses,

    ){
                setIDNumber(iDNumber);
                setFirstName(firstName);
                setLastName(lastName);
                setPhoneNumber(phoneNumber);
                setEmail(eMail); 
                setBillingAddress(billing);
                setShippingAddress(shipping);

                //setCustomerAddresses(); 
                //assignAddresses(addresses);   
    }
    

	//Operations
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

    private Object getCity() {
        return null;
    }

    private Object getLine2() {
        return null;
    }
    private Object getState(){
        return null;
    }
    private Object getZip(){
        return null;
    }
    

    /* public void setCustomerAddresses(Address billing, Address shipping){
        setBillingAddress(billing);
        setShippingAddress(shipping);
    } */
    /* public  void assignBillingAddress(ArrayList<Address> addresses){
        for(Address a : addresses){
            if(a.getAddressID() == 2){
                 setBillingAddress(a);
             }
         }
        }
        public  void assignShippingAddress(ArrayList<Address> addresses){
            for(Address a : addresses){
                if(a.getAddressID() == 3){
                     setShippingAddress(a);
                 }
             }
            }
            public void assignAddresses(ArrayList<Address> addresses){
                assignMailingAddress(addresses); 
                assignBillingAddress(addresses); 
                assignShippingAddress(addresses);
            } */
    public String printBillingAddress(String line2){
        StringBuilder sb = new StringBuilder();
        sb.append(getLine2());
        if (!line2.equals("") && getLine2() != null){
            sb.append("\r\n");
            sb.append(getLine2());
        }
        sb.append("\r\n");
        sb.append(getCity() + " " + getState() + ", " + getZip());

        return sb.toString();
    }

    public String getCustomerInfo() {
        return (
            getPersonInfo()
            + " " + getBillingAddress() 
            + " " + getShippingAddress()
        );
    }

}


    
    
