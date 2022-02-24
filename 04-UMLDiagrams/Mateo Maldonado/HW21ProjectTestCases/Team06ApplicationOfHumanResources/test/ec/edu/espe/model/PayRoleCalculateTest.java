/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mateo Maldonado
 */
public class PayRoleCalculateTest {
    
    public PayRoleCalculateTest() {
    }

    /**
     * Test of basicsalary method, of class PayRoleCalculate.
     */
    @Test
    public void testBasicsalary() {
        System.out.println("basicsalary");
        float hoursworked = 45.5F;
        float hourlyrate = 6.7F;
        PayRoleCalculate instance = new PayRoleCalculate();
        float expResult = 304.85F;
        float result = instance.basicsalary(hoursworked, hourlyrate);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of bonus method, of class PayRoleCalculate.
     */
    @Test
    public void testBonus() {
        System.out.println("bonus");
        float basicsalary = 304.85F;
        PayRoleCalculate instance = new PayRoleCalculate();
        float expResult = 60.97F;
        float result = instance.bonus(basicsalary);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of grosssalary method, of class PayRoleCalculate.
     */
    @Test
    public void testGrosssalary() {
        System.out.println("grosssalary");
        float basicsalary = 304.85F;
        float bonus = 60.97F;
        PayRoleCalculate instance = new PayRoleCalculate();
        float expResult = 365.82F;
        float result = instance.grosssalary(basicsalary, bonus);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of discount method, of class PayRoleCalculate.
     */
    @Test
    public void testDiscount() {
        System.out.println("discount");
        float grosssalary = 365.82F;
        PayRoleCalculate instance = new PayRoleCalculate();
        float expResult = 36.582F;
        float result = instance.discount(grosssalary);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of netsalary method, of class PayRoleCalculate.
     */
    @Test
    public void testNetsalary() {
        System.out.println("netsalary");
        float grosssalary = 365.82F;
        float discount = 36.582F;
        PayRoleCalculate instance = new PayRoleCalculate();
        float expResult = 329.238F;
        float result = instance.netsalary(grosssalary, discount);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
