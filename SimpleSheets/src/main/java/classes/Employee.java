package main.java.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person {
    //Members
    private Date hireDate;
    private double salary;
    private String department;
    private double comissionRate;
    

    //Constructors
    public Employee(int iDNumber, 
    String firstName, 
    String lastname, 
    String phoneNumber, 
    String eMail,
    Address mailing, 
    String hireDate, 
    double salary, 
    String department, 
    double comissionRate,
    ArrayList<Double>totalComissions
    )
    throws ParseException
     {
        setHireDate(hireDate);
        setSalary(salary);
        setDepartment(department);
        setComissionRate(comissionRate);
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

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
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
        + " " + getComissionRate()
        );
    }
    
    
}