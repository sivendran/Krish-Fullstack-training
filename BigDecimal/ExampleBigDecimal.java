import java.math.BigDecimal;
public class ExampleBigDecimal
{
    public static void main(String[] args) 
    {
        
        BigDecimal bdec1 = new BigDecimal("12.234");
      
        BigDecimal bdec2 = new BigDecimal("18.234");
               
  
        bdec1 = bdec1.add(bdec2);
        System.out.println("BigDecimal1 = " + bdec1);
  
        bdec1 = bdec1.multiply(bdec2);
        System.out.println("BigDecimal1 = " + bdec1);
  
        bdec1 = bdec1.subtract(bdec2);
        System.out.println("BigDecimal1 = " + bdec1);
  
        bdec1 = bdec1.divide(bdec2);
        System.out.println("BigDecimal1 = " + bdec1);
  
      
  
    }    
}        