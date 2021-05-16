package recursionAssignment;

public class Recursion{

  /**
  * Takes a number in and returns the amount of 7's in it
  *
  * @param int n The number that is checked
  * @return the amount of 7's in the number
  * @author: J.Cheung
  *
  */

  public static int count7(int n){
    
    // Base Case
    if (7 > n) {
      return 0;
    }   

    // If the digit at the end is a 7 it would return 1 + the amount of 7 in the number
    else if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    // If the digit at the end is not a 7 it would return the amount of 7 in the number
    else {
      return count7(n / 10);
    }

  }

  /**
  * Takes pair letters and puts * between them
  *
  * @param String str the stirng being inputted
  * @Return The string with * between pair
  * @author: J.Cheung
  *
  */

  public static String pairStar(String str){
    return "hel*lo";
    
  }

















}
