package main.java.classes;

public class Address {

    //members
    int addressID;
    String line1;
    String line2;
    String city;
    String state;
    int zip;

    //constructors
    public Address(int addressID, 
    String line1, 
    String line2, 
    String city, 
    String state, 
    int zip
    ) {
        this.addressID = addressID;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
  
	//operations
    public void setAddressID(int addressID){
        this.addressID = addressID;
    }
    public int getAddressID(){
        return addressID;
    }
    public void setLine1(String line1){
        this.line1 = line1;
    }
    public String getLine1(){
        return line1;
    }
 
    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    /* public String getAddressInfo(){
        return (getAddressID()
        + " " + getLine1()
        + " " + getLine2()
        + " " + getCity()
        + " " + getState()
        + " " + getZip()
        ); 
    }*/
    public String formatAddress(int id, 
    String line1, 
    String line2, 
    String city, 
    String state, 
    int zip
    ){  
        StringBuilder sb = new StringBuilder();
        sb.append(line1);
        if (!line2.equals("") && line2 != null){
            sb.append("\r\n");
            sb.append(line2);
        }
        sb.append("\r\n");
        sb.append(city + " " + state + ", " + zip);

        return sb.toString();
        }
        

        
}