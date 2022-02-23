package ec.edu.espe.model;
/**
 *
 * @author Team06
 */
public abstract class Employee {
        
    private String name;
    private String lastName;
    private String id;
    
    private int hoursWorked;
    private int hourlyPay;
    
    public Employee(){
       
    }

    public Employee(String name, String lastName, String id, int hoursWorked, int hourlyPay) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

    public String getName() {
        return name;
    }

    public String getLast_Name() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getHours_worked() {
        return hoursWorked;
    }

    public int getHourly_pay() {
        return hourlyPay;
    }

    public abstract double gross_salary ();
    public abstract int overtime ();
    public abstract double net_salary ();
    public abstract String print ();

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_Name(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHours_worked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourly_pay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
} 