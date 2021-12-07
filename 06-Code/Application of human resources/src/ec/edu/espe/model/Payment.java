
package ec.edu.espe.model;

public class Payment {

    private boolean paydate;
    private int hoursworked;
    private String workerposition;
    private int moneytopay;
      
    public boolean CheckIfisDateOfPayment(){
               
    return false;
    }
    
    public void totalpayment(){
        
    }
    
    public void WhoAreGoingToBePaid(){
        
    }
    
    @Override
    public String toString(){
        return "Payment{" + "paydate=" + paydate + ", hoursworked=" + hoursworked + ", workerposition=" + workerposition + ", moneytopay=" + moneytopay + '}';
    }

/**
     * @return the paydate
     */
    public boolean isPaydate() {
        return paydate;
    }

    /**
     * @param paydate the paydate to set
     */
    public void setPaydate(boolean paydate) {
        this.paydate = paydate;
    }

    /**
     * @return the hoursworked
     */
    public int getHoursworked() {
        return hoursworked;
    }

    /**
     * @param hoursworked the hoursworked to set
     */
    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    /**
     * @return the workerposition
     */
    public String getWorkerposition() {
        return workerposition;
    }

    /**
     * @param workerposition the workerposition to set
     */
    public void setWorkerposition(String workerposition) {
        this.workerposition = workerposition;
    }

    /**
     * @return the moneytopay
     */
    public int getMoneytopay() {
        return moneytopay;
    }

    /**
     * @param moneytopay the moneytopay to set
     */
    public void setMoneytopay(int moneytopay) {
        this.moneytopay = moneytopay;
    }
}