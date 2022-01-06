package ec.edu.espe.model;

public abstract class Employee {
    private String name;
    private String Last_Name;
    private String id;
    
    private int hours_worked;
    private int hourly_pay;
    
    public Employee(){

    }

    public Employee(String name, String Last_Name, String id, int hours_worked, int hourly_pay) {
        this.name = name;
        this.Last_Name = Last_Name;
        this.id = id;
        this.hours_worked = hours_worked;
        this.hourly_pay = hourly_pay;
    }

    public String getName() {
        return name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getId() {
        return id;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public int getHourly_pay() {
        return hourly_pay;
    }

    public abstract double gross_salary ();
    public abstract int overtime ();
    public abstract double net_salary ();
    public abstract String print ();

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public void setHourly_pay(int hourly_pay) {
        this.hourly_pay = hourly_pay;
    }
} 