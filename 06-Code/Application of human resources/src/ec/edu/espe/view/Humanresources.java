
package ec.edu.espe.view;

import ec.edu.espe.model.Company;
import java.util.Scanner;
import  ec.edu.espe.model.Workers;
import  ec.edu.espe.model.Orders;
import  ec.edu.espe.model.Employee;
import ec.edu.espe.model.Payment;

/**
 *
 * @author MateoMaldonado
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
    
    Payment payment1 = new Payment (paydate, hoursworked, workerposition, moneytopay);
        System.out.println(payment1);
    
    Company company1 = new Company(hoursOfAttention, moneyEarned, location);
        System.out.println(company1);
    }
}
