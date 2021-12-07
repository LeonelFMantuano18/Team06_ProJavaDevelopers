
package ec.edu.espe.model;


public class Orders {

    private static Orders order1;
    
    int day;
    String revenues;
    String expenses;

    public Orders(int day, String revenues, String expenses, boolean transfers) {
        this.day = day;
        this.revenues = revenues;
        this.expenses = expenses;
        this.transfers = transfers;
    }
    boolean transfers;
    
    
public static void main(String [] args) {  
    Orders.order1 = new Orders();

        order1.day = 17;

        System.out.println("the day of order is : "+order1.day);
}

    private Orders() {
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
