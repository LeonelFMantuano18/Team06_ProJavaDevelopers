
package ec.edu.espe.view;

import ec.edu.espe.model.Company;
import java.util.Scanner;
import  ec.edu.espe.model.Workers;
import  ec.edu.espe.model.Orders;
import  ec.edu.espe.model.Employee;
import  ec.edu.espe.model.Payment;
import  ec.edu.espe.model.Transportation;
import  ec.edu.espe.model.Employee;
import ec.edu.espe.model.Payrole;
import ec.edu.espe.model.Profile;

/**
 *
 * @author MateoMaldonado, AnthonyMorales, DiegoPalacios
 */
public class Humanresources {
    
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
       
    String how_long_you_have_working="";
    String how_long_before_retirement="";
    
    String name= "";
    int id=0;
    String area_Work="";
    int password=0;
    
    int salary=0;
    int debts=0;
    
    Payment payment1 = new Payment (paydate, hoursworked, workerposition, moneytopay);
        System.out.println("payment1");
    
    Company company1 = new Company(hoursOfAttention, moneyEarned, location);
        System.out.println("company1");
    
    Transportation transportation1 = new Transportation (the_job_includes_transportaion, how_many_workers_have_a_car);
        System.out.println('transportation1");
        
    Employee employee1 = new Employee(how_long_you_have_working, how_long_before_retirement);
        System.out.println("employee1");
    
    Profile profile1 = new Profile(name, id, area_Work, password );  
        System.out.println("profile1");
        
    Payrole payrole1 = new Payrole(salary, debts);
        System.out.println("payrole1");    
        
    }
}   
