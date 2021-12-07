
package ec.edu.espe.model;

public class Employee {
    private String how_long_you_have_working;
    private String how_long_before_retirement;
    
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        
    
    }

    private Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Checkthetimeinthecompany (){
        
    }
    public void Checkremainingtime (){
        
    }

    @Override
    public String toString() {
        return "Employee{" + "how_long_you_have_working=" + how_long_you_have_working + ", how_long_before_retirement=" + how_long_before_retirement + '}';
    }

    public Employee(String how_long_you_have_working, String how_long_before_retirement) {
        this.how_long_you_have_working = how_long_you_have_working;
        this.how_long_before_retirement = how_long_before_retirement;
    }

    /**
     * @return the how_long_you_have_working
     */
    public String getHow_long_you_have_working() {
        return how_long_you_have_working;
    }

    /**
     * @param how_long_you_have_working the how_long_you_have_working to set
     */
    public void setHow_long_you_have_working(String how_long_you_have_working) {
        this.how_long_you_have_working = how_long_you_have_working;
    }

    /**
     * @return the how_long_before_retirement
     */
    public String getHow_long_before_retirement() {
        return how_long_before_retirement;
    }

    /**
     * @param how_long_before_retirement the how_long_before_retirement to set
     */
    public void setHow_long_before_retirement(String how_long_before_retirement) {
        this.how_long_before_retirement = how_long_before_retirement;
    }

    }
    
