
package ec.edu.espe.model;

import java.util.ArrayList;

public class Payment {

    private boolean paydate;
    private int hoursworked;
    private String workerposition;
    private int moneytopay;
    
    private ArrayList<Profile> Profiles;

    public Payment(boolean paydate, int hoursworked, String workerposition, int moneytopay, ArrayList<Profile> Profiles) {
        this.paydate = paydate;
        this.hoursworked = hoursworked;
        this.workerposition = workerposition;
        this.moneytopay = moneytopay;
        this.Profiles = Profiles;
    }

    public boolean CheckIfisDateOfPayment(){
               
    return false;
    }
    
    public void totalpayment(){
        
    }
    
    public void WhoAreGoingToBePaid(){
        
    }
    
    @Override
    public String toString(){
        return "Payment{" + "paydate=" + isPaydate() + ", hoursworked=" + getHoursworked() + ", workerposition=" + getWorkerposition() + ", moneytopay=" + getMoneytopay() + '}';
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

    /**
     * @return the Profiles
     */
    public ArrayList<Profile> getProfiles() {
        return Profiles;
    }

    /**
     * @param Profiles the Profiles to set
     */
    public void setProfiles(ArrayList<Profile> Profiles) {
        this.Profiles = Profiles;
    }
}