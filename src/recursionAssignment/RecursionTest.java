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
  public void beforeTest() {
    // some steps to peform before tests are run
  }

  @After 
  public void afterTest() {
    // some steps to perform after tests are run
  }
  
  /**
   * An initial test
  */
 
  // Problem set 1 - count7

  @Test
  public void Test1_1() {
    assertEquals(2,Recursion.count7(717));
  }
  
  @Test
  public void Test1_2() {
    assertEquals(1,Recursion.count7(7));
  }
  
  @Test
  public void Test1_3() {
    assertEquals(0,Recursion.count7(123));
  }
    
  // Problem set 2 - pairStar

  @Test
  public void Test2_1() {
    assertEquals("hel*lo",Recursion.pairStar("hello"));
  }

  @Test
  public void Test2_2() {
    assertEquals("x*xy*y",Recursion.pairStar("xxyy"));
  }

  @Test
  public void Test2_3() {
    assertEquals("a*a*a*a",Recursion.pairStar("aaaa"));
  }

  // Problem set 3 - stringClean

  @Test 
  public void Test3_1(){
    assertEquals("yza",Recursion.stringClean("yyzzza"));

  }
  
  @Test
  public void Test3_2() {
    assertEquals("abcd",Recursion.stringClean("abbbcdd"));
  }

  @Test
  public void Test3_3() {
    assertEquals("Helo",Recursion.stringClean("Hello"));
  }
  
}
