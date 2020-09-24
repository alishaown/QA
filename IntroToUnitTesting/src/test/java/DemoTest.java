/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;
public class DemoTest {
    @Test
    public void test_is_triangle1()
    {
       assertTrue(Demo.isTriangle(3,2,3)); 
    }
    @Test
 public void test_is_triangle2()
    {
       assertTrue(Demo.isTriangle(2,2,3)); 
    }
 @Test
 public void test_is_triangle3()
    {
       assertTrue(Demo.isTriangle(11,7,13)); 
    }
  @Test
    public void test_is_triangle4()
    {
       assertTrue(Demo.isTriangle(3,4,5)); 
    }
      @Test
    public void test_is_triangle5()
    {
       assertTrue(Demo.isTriangle(13,12,5)); 
    }
     public void test_is_triangle6()
    {
       assertTrue(Demo.isTriangle(11,13,7)); 
    }
 @Test
 public void test_is_not_triangle1()
    {
       assertFalse(Demo.isTriangle(1,2,3)); 
    }
 @Test
 public void test_is_not_triangle2()
    {
       assertFalse(Demo.isTriangle(-1,2,3)); 
    }
 @Test
 public void test_is_not_triangle3()
    {
       assertFalse(Demo.isTriangle(0,2,3)); 
    }
 @Test
 public void test_is_not_triangle4()
    {
       assertFalse(Demo.isTriangle(5,9,3)); 
    }
 @Test
 public void test_is_not_triangle5()
    {
       assertFalse(Demo.isTriangle(5,0,-3)); 
    }
  @Test
 public void test_is_not_triangle6()
    {
       assertFalse(Demo.isTriangle(13,5,7)); 
    }
 
 /*public void test_main_program_1()
 {
     ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes()); 
     System.setIn(in);
     ByteArrayOutputStream out = new ByteArrayOutputStream();
     System.setOut(new PrintStream(out));
     String consoleOutput= "Enter side 1: \n" ;
     consoleOutput += "Enter side 2: \n" ;
     consoleOutput += "Enter side 3: \n" ;
     consoleOutput += "This is a triangle.\n" ;
     assertEquals(consoleOutput,out.toString());
 }*/
}
