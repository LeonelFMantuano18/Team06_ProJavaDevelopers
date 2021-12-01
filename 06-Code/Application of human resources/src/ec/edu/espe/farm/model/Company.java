
package ec.edu.espe.farm.model;

public class Company {
        
    private int hoursOfAttention;
    private int moneyEarned;
    private String location;
    
    public void MoneyEarnedInTheLastMonth(){
             
    }
    public void ExpensesInTheLastMonth(){
        
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
