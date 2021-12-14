package ec.edu.espe.model;

import java.util.ArrayList;

public class Transportation {
    private Boolean the_job_includes_transportation;
    private int how_many_workers_have_a_car;
    private ArrayList<Transportation> transportations;
    
    public static void main(String[] args) {
        Transportation transportation1 = new Transportation();
    }

    private Transportation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean CheckforTransport(){
    
    return true;
    }
    public void CheckhowmanyhaveTransportation(){
        
    }

    @Override
    public String toString() {
        return "Transportation{" + "the_job_includes_transportation=" + the_job_includes_transportation + ", how_many_workers_have_a_car=" + how_many_workers_have_a_car + '}';
    }

    public Transportation(Boolean the_job_includes_transportation, int how_many_workers_have_a_car) {
        this.the_job_includes_transportation = the_job_includes_transportation;
        this.how_many_workers_have_a_car = how_many_workers_have_a_car;
    }
    
    /**
     * @return the the_job_includes_transportation
     */
    public Boolean getThe_job_includes_transportation() {
        return the_job_includes_transportation;
    }

    /**
     * @param the_job_includes_transportation the the_job_includes_transportation to set
     */
    public void setThe_job_includes_transportation(Boolean the_job_includes_transportation) {
        this.the_job_includes_transportation = the_job_includes_transportation;
    }

    /**
     * @return the how_many_workers_have_a_car
     */
    public int getHow_many_workers_have_a_car() {
        return how_many_workers_have_a_car;
    }

    /**
     * @param how_many_workers_have_a_car the how_many_workers_have_a_car to set
     */
    public void setHow_many_workers_have_a_car(int how_many_workers_have_a_car) {
        this.how_many_workers_have_a_car = how_many_workers_have_a_car;
    }
}