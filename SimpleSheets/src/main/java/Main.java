package main.java;

//imports
import java.util.ArrayList;
import main.java.classes.*;
import java.text.ParseException;
public class Main {
        public static void main(String[] args) throws ParseException {
        
                //LocalDate hireDate = LocalDate.parse("2014-02-24");
                // System.out.println(hireDate);
                
                //List of Addresses
                ArrayList<Address> addresses  = new ArrayList<Address>();
                addresses.add(
                        new Address(
                                1,
                                "123 Main st",
                                "",
                                "The dalles",
                                "OR",
                                97058
                                )
                );
                addresses.add(
                        new Address(
                                2,
                                "PO box 555",
                                "",
                                "The dalles",
                                "OR",
                                97058
                        )
                );
                addresses.add(new Address(3, "245 Country Lane", "apt 15", "Portland", "OR", 97035));

                //List of Customers
                ArrayList<Customer> customers = new ArrayList<Customer>();
                customers.add(
                        new Customer(
                                1, 
                                "David",
                                "Schmidt",
                                "5419804355",
                                "email@email.com",
                                addresses.get(0),
                                addresses.get(1)
                        )
                );

                customers.add(
                        new Customer(
                                2,
                                "John",
                                "Does",
                                "5429654545",   
                                "email@email.com",
                                addresses.get(0),
                                addresses.get(0)
                        )
                );
                customers.add(
                        new Customer(
                                3,
                                "Eric",
                                "Brown",
                                "5415065009",
                                "email@email.com",
                                addresses.get(2),
                                addresses.get(2)
                        )
                );
                ArrayList<Employee> employees = new ArrayList<Employee>();
                employees.add(
                         new Employee(
                                1,
                                "Jane",
                                "Smith",
                                "555345454",
                                "email@emil.com",
                                addresses.get(0),
                                "03/18/2020",
                                45000.00,
                                "Sales",
                                0.15,
                                null
                        )
                );
                employees.add(
                         new Employee(
                                1,
                                "John",
                                "Doe",
                                "5419865656",
                                "eMail@email.com",
                                addresses.get(0),
                                "03/18/2020",
                                45000.00,
                                "Sales",
                                0.15,
                                null
                        )
                );
                ArrayList<Product> products = new ArrayList<Product>();
                products.add(
                        new Product(
                                "Hammermill Paper",
                                31.99,
                                10,
                                1        
                        )
                ); 
                products.add(
                        new Product(
                                "Tru Red Paper",
                                55.99,
                                15,
                                2
                        )
                );
                products.add(
                        new Product(
                                "Domtar Paper",
                                59.29,
                                5,
                                3
                        )
                );
                        ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
                        lineItems.add(
                                10,
                                products.get(0),
                                lineItems(LineItem.calcTotal());
                        
                        
                        
                        Order orders = new Order (1, customers.get(0), 
                        employees.get(0), true, lineItems.get(0), 10.5);
                        
        }

}
        
        


        



    