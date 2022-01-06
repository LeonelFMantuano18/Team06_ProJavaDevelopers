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

/*ArrayList<company> company = new ArrayList<>();
        
        System.out.println(" Mateo Maldonado ");
        System.out.println("What do you want to do? -> Open Menu : Yes(1) / No (0)");
        firstOption = scanner.nextInt();
        while (firstOption == 1) {
            System.out.println("Company information");
            secondOption = scanner.nextInt();

            if (secondOption == 1) {
                System.out.println("--> Enter data of company<-- ");

                System.out.println("Name --> ");
                name = scanner.next();

                System.out.println("Owner --> ");
                Owner = scanner.next();

                System.out.println("attention --> ");
                attention = scanner.nextInt();

                System.out.println("Molting --> ");
                molting = scanner.nextBoolean();

                company = new any(name, owner, attention, molting);
                company.add(company);
                
                System.out.println("\n");
                
            }
            if (secondOption == 2) {
                System.out.println("Enter the Id of the pany you want to remove:");
                name = scanner.next();
                company.remove(name);
                System.out.println("company has benn removed"));
                System.out.println("\n");
            }
            if (secondOption == 3) {
                System.out.println("total companys ");
                System.out.println("comany -> " + total.companys);
                System.out.println("\n");
            }
            
            }
            if (secondOption == 5) {
                break;*/