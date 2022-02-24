/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author Mateo Maldonado
 */
public class PayRoleCalculate {
    public float basicsalary(float hoursworked, float hourlyrate){
        
        float basicsalary;
        
       basicsalary = hoursworked*hourlyrate;
        
        return basicsalary;
    }             
        
    public float bonus(float basicsalary){
        
        float bonus;
        
        
        bonus = (float) (basicsalary*0.2);
        
        return bonus;
        
    }
    
    public float grosssalary(float basicsalary, float bonus){
        
        float grosssalary;
        
        grosssalary = basicsalary+bonus;
        
        return grosssalary;
    }

    public float discount(float grosssalary){
        
        float discount;
        
        discount = (float) (grosssalary*0.1);
        
        return discount;
    }
    

    public float netsalary(float grosssalary, float discount){
        
        float netsalary;
        
        netsalary = grosssalary-discount;
        
        return netsalary;
    }
}
        
