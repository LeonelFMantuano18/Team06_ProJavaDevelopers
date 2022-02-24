
package ec.edu.espe.mathoperationshr;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anthony Morales, DEEL-ESPE
 */
public class OvertimeTest {
    
    public OvertimeTest() {
    }

    /**
     * Test of product method, of class Overtime.
     */
    @Test
    public void testProduct() {
        System.out.println("product");
        float hours = 8.0F;
        float value = 2.5F;
        Overtime instance = new Overtime();
        float expResult = 20.0F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductOvertime() {
        System.out.println("product 2");
        float hours = 4.0F;
        float value = 2.7F;
        Overtime instance = new Overtime();
        float expResult = 10.8F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductExtra() {
        System.out.println("product 3");
        float hours = 2.0F;
        float value = 2.5F;
        Overtime instance = new Overtime();
        float expResult = 5.0F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductOvertime2() {
        System.out.println("product 4");
        float hours = 3.5F;
        float value = 3.0F;
        Overtime instance = new Overtime();
        float expResult = 10.5F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductExtra2() {
        System.out.println("product 5");
        float hours = 5.5F;
        float value = 12.5F;
        Overtime instance = new Overtime();
        float expResult = 68.75F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductOvertime3() {
        System.out.println("product 6");
        float hours = 6.0F;
        float value = 3.2F;
        Overtime instance = new Overtime();
        float expResult = 19.2F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductExtra3() {
        System.out.println("product 7");
        float hours = 8.0F;
        float value = 2.3F;
        Overtime instance = new Overtime();
        float expResult = 18.4F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testProductOvertime4() {
        System.out.println("product 8");
        float hours = 9.0F;
        float value = 3.6F;
        Overtime instance = new Overtime();
        float expResult = 32.4F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.01);
    }
    
        @Test
    public void testProductExtra4() {
        System.out.println("product 9");
        float hours = 12.0F;
        float value = 1.2F;
        Overtime instance = new Overtime();
        float expResult = 14.4F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.01);
    }
    
        @Test
    public void testProductOvertime5() {
        System.out.println("product 10");
        float hours = 12.5F;
        float value = 3.9F;
        Overtime instance = new Overtime();
        float expResult = 48.75F;
        float result = instance.product(hours, value);
        assertEquals(expResult, result, 0.0);
    }
}
