import gt.edu.umg.ingenieria.sistemas.is.integration.test.CalculatorService;
import gt.edu.umg.ingenieria.sistemas.is.integration.test.ResultFormatter;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegrationTest {
        
    @Test
    public void when1and2() {
        System.out.println("Test #1");
        ResultFormatter formatter = new ResultFormatter();
        CalculatorService service = new CalculatorService();
        
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        int actualResult = formatter.format(service.doAdd(a, b));
        
        assertEquals(expectedResult, actualResult);
        
        assertTrue(expectedResult >= a);
        
        assertTrue(expectedResult >= b);
    }
    
    @Test
    public void when1andMaxInteger() {
        System.out.println("Test #2");
        ResultFormatter formatter = new ResultFormatter();
        CalculatorService service = new CalculatorService();
        
        int a = 1;
        int b = Integer.MAX_VALUE;
        int expectedResult = Integer.MIN_VALUE;
        int actualResult = formatter.format(service.doAdd(a, b));
        
        assertEquals(expectedResult, actualResult);
        
        assertTrue(expectedResult < 0);        
    }
}
