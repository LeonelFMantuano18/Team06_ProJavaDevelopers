/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author andresmaldonado
 */
public class Company {
    
    private int hoursOfAttention;
    private int moneyEarned;
    private String location;
    
    public void MoneyEarnedInTheLastMonth(){
             
    }
    public void ExpensesInTheLastMonth(){
        
    }

    public Company(int hoursOfAttention, int moneyEarned, String location, String name, String Id, String gender, int age) {
        //super(name, Id, gender, age);
        this.hoursOfAttention = hoursOfAttention;
        this.moneyEarned = moneyEarned;
        this.location = location;
    }

    
    

    @Override
    public String toString(){
        return "Company{" + "hoursOfAttention=" + hoursOfAttention + ", moneyEarned=" + moneyEarned + ", location=" + location + '}';
    }
    
    /**
     * @return the hoursOfAttention
     */
    public int getHoursOfAttention() {
        return hoursOfAttention;
    }

    /**
     * @param hoursOfAttention the hoursOfAttention to set
     */
    public void setHoursOfAttention(int hoursOfAttention) {
        this.hoursOfAttention = hoursOfAttention;
    }

    /**
     * @return the moneyEarned
     */
    public int getMoneyEarned() {
        return moneyEarned;
    }

    /**
     * @param moneyEarned the moneyEarned to set
     */
    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
}