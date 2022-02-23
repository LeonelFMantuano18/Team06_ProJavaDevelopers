package ec.edu.espe.model;
/**
 *
 * @author Team06
 */
public class Company extends Worker{
            
    private int hoursOfAttention;
    private int moneyEarned;
    private String location;
    
    public void MoneyEarnedInTheLastMonth(){
             
    }
    public void ExpensesInTheLastMonth(){
        
    }

    public Company(int hoursOfAttention, int moneyEarned, String location, String name, String Id, String gender, int age) {
        super(name, Id, gender, age);
        this.hoursOfAttention = hoursOfAttention;
        this.moneyEarned = moneyEarned;
        this.location = location;
    }    

    @Override
    public String toString(){
        return "Company{" + "hoursOfAttention=" + hoursOfAttention + ", moneyEarned=" + moneyEarned + ", location=" + location + '}';
    }
    
    public int getHoursOfAttention() {
        return hoursOfAttention;
    }

    public void setHoursOfAttention(int hoursOfAttention) {
        this.hoursOfAttention = hoursOfAttention;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}