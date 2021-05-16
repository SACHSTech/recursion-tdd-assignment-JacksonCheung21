package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

/**
* Test file for Recursion.java
* @author: J.Cheung
*
*/

public class RecursionTest{
  
  @Before
  public void beforeTest(){
    // some steps to peform before tests are run
  }

  @After 
  public void afterTest(){
    // some steps to perform after tests are run
  }
  
  /**
   * An initial test
  */
 
  // Problem set 1 - count7

  @Test
  public void Test1(){
    assertEquals(2,Recursion.count7(717));
  }
  
  @Test
  public void Test2(){
    assertEquals(1,Recursion.count7(7));
  }
  
  @Test
  public void Test3(){
    assertEquals(0,Recursion.count7(123));
  }
    
}
