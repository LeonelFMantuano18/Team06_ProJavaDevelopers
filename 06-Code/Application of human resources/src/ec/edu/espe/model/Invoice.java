package ec.edu.espe.model;

/**
 *
 * @author Maisincho Richar 
 */
public class Invoice {

    //atributos
    @Override
    public String toString() {
        return "Invoice{" + "customer=" + customer + ", datecustomer=" + datecustomer + ", date=" + date + ", adress=" + adress + ", amount=" + amount + '}';
    }

    public Invoice(String customer, String datecustomer, int date, String adress, int amount) {
        this.customer = customer;
        this.datecustomer = datecustomer;
        this.date = date;
        this.adress = adress;
        this.amount = amount;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setDatecustomer(String datecustomer) {
        this.datecustomer = datecustomer;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    private String customer; 
    private String datecustomer;
    private int date;
    private String adress;
    private  int amount;
        
    //metodo
    

}
