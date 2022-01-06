/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.view;

    import ec.edu.espe.model.Company;
    import  ec.edu.espe.model.Employee;
    import java.util.ArrayList;
/**
 *
 * @author andresmaldonado
 */
public class VersionOfClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    boolean paydate=false;
    int hoursworked=0;
    String workerposition="";
    int moneytopay=0;
    
    int hoursOfAttention=0;
    int moneyEarned=0;
    String location="";
    
    boolean the_job_includes_transportaion=true;
    int how_many_workers_have_a_car = 0;
    ArrayList<Transportation> transportations = new ArrayList<>();
       
    String how_long_you_have_working="";
    String how_long_before_retirement="";
    ArrayList<Employee> employees = new ArrayList<>();
    
    String name= "";
    int id=0;
    String area_Work="";
    int password=0;
    
    int salary=0;
    int debts=0;
    ArrayList<Profile> Profiles = new ArrayList<>();
    

    /*Payment payment1 = new Payment (paydate, hoursworked, workerposition, moneytopay, Profiles);
        System.out.println(payment1);

    
    Transportation transportation1 = new Transportation (the_job_includes_transportaion, how_many_workers_have_a_car);
        System.out.println("transportation1");*/
        
    Employee employee1 = new Employee(how_long_you_have_working, how_long_before_retirement) {
        @Override
        public double gross_salary() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int overtime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double net_salary() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
        System.out.println("employee1");
    
    Profile profile1 = new Profile(name, id, area_Work, password );  
        System.out.println("profile1");
        
    Payrole payrole1 = new Payrole(salary, debts);
        System.out.println("payrole1");    
        
    }
}   

        // TODO code application logic here
    }
   
