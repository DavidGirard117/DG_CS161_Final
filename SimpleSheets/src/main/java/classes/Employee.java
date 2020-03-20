package main.java.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {
    //Members
    private Date hireDate;
    private double salary;
    private String department;
    private double commissionRate;
    

    //Constructors
    public Employee(int iDNumber, 
    String firstName, 
    String lastName, 
    String phoneNumber, 
    String eMail,
    Address mailing, 
    String hireDate, 
    double salary, 
    String department, 
    double commissionRate
    )
   // throws ParseException
     {
        //setHireDate(hireDate);
        setSalary(salary);
        setDepartment(department);
        setCommissionRate(commissionRate);
        setMailingAddress(mailing);
    }

    //Operations
    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public void setHireDate(String hireDate)throws ParseException{
        SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
        Date date = formatDate.parse(hireDate);
        this.hireDate = date;
    }

    
    public String getEmployeeInfo(){
        return (getPersonInfo()
        + " " + getHireDate()
        + " " + getSalary()
        + " " + getCommissionRate()
        );
    }
    
    
}