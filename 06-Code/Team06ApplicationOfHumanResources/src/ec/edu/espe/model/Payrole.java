package ec.edu.espe.model;

public class Payrole extends Employee{
    //  this class does not contain the same attributes and methods as the UML diagram

    
    int number_of_children;
    
    public Payrole (){
        
    }

    public Payrole(String name, String Last_Name, String id, int hours_worked, int hourly_pay, int number_of_children) {
        super(name, Last_Name, id, hours_worked, hourly_pay);
        
        this.number_of_children = number_of_children;
    }

 
    
    
    
    @Override
    public double gross_salary() {
        return getHours_worked() *  getHourly_pay (); 
    }

    @Override
    public int overtime() {
        int h_extra = getHours_worked() - 30;
        
        if (getHours_worked() > 30)
            return  h_extra;
        else
            return 0;
        
    }

    @Override
    public double net_salary() {
       
        return gross_salary() + overtime();
    }

    /**
     *
     * @return
     */
    @Override
    public String print (){
        return "Last_name"+
                "Employee Invoice" + "\n" +
                "Name: " + getName()+ "\n"+
                "Last_Name"+ super.getLast_Name()+ "\n"+ 
                "Id:"+super.getId()+"\n"+
                "" + "\n"+
                
                "Ivoice"+ "\n"+
                "gross salary: S/" + this.gross_salary() + "\n "+
                "net salay: s/" + this.net_salary();
                
    }
}

//atributos