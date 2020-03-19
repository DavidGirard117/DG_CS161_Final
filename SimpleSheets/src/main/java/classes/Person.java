package main.java.classes;

abstract class Person {
    //members
    private int iDNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eMail;
    private Address mailingAddress;
    
    //Operations

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
    public String getFullName(){
        return (getFirstName() + "  " + getLastName());
    }

    
    public String getPersonInfo(){
        return (getIDNumber()
        + " " + getFirstName()
        + " " + getLastName()
        + " " + getPhoneNumber()
        + " " + getEmail()
        + " " + getMailingAddress()
        );
    }
    public void setMailingAddresses(Address mailing){
        setMailingAddress(mailing);
    }

    
    
    
}