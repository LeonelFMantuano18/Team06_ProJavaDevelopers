
package ec.edu.espe.model;


public class Order {

    private static Order order1;
    
    int day;
    String revenues;
    String expenses;

    public Order(int day, String revenues, String expenses, boolean transfers) {
        this.day = day;
        this.revenues = revenues;
        this.expenses = expenses;
        this.transfers = transfers;
    }
    boolean transfers;
    
    
public static void main(String [] args) {  
    Order.order1 = new Order();

        order1.day = 17;

        System.out.println("the day of order is : "+order1.day);
}

    private Order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    /**
     *
     * @return
     */

    /**
     *
     * @param transfers
     * @return
     */



    public boolean transfers(boolean transfers)
    {
    int n = 0;
        if (n+1 == 2) {
            return true;
        } else {
        return false;
    }
   
}
  

}
