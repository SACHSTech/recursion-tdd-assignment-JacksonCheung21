package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    

  /**
   * An initial test
  */
  

   @After 
  public void afterTest(){
    // some steps to perform after tests are run
  }
 
  @Test
  public void Test1(){
    assertEquals(Recursion.count7(717),2);
  }
  
 
    
    
}
