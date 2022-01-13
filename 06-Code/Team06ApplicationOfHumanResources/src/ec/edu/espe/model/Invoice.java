



// autor Richar Maisincho

package ec.edu.espe.model;

public class Invoice extends Employee{
    
    private String ruc;

    public Invoice(String ruc) {
        this.ruc = ruc;
    }

    /**
     *
     * @param ruc
     * @param name
     * @param Last_Name
     * @param id
     * @param hours_worked
     * @param hourly_pay
     */
    public Invoice (){
        
    }
    public Invoice(String ruc, String name, String Last_Name, String id, int hours_worked, int hourly_pay) {
        super(name, Last_Name, id, hours_worked, hourly_pay);
        
     
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    
    
    
    @Override
    public double gross_salary() {
     return getHours_worked() *  getHourly_pay (); }

    @Override
    public int overtime() {
           int h_extra = getHours_worked() - 30;
        
        if (getHours_worked() > 30)
            return  h_extra;
        else
            return 0; }

    @Override
    public double net_salary() {
          return gross_salary() + overtime();
 
    
    }
    
    @Override
    public String print (){
        return "Last_name"+
                "Employee Invoice" + "\n" +
                "Name: " + getName()+ "\n"+
                "Last_Name"+ super.getLast_Name()+ "\n"+ 
                "Id:"+super.getId()+"\n"+
                "Ruc:" + getRuc() + "\n" +
                "" + "\n"+
                
                "Ivoice"+ "\n"+
                "gross salary: S/" + this.gross_salary() + "\n "+
                "net salay: s/" + this.net_salary();
                
    }

    
    
    
}
