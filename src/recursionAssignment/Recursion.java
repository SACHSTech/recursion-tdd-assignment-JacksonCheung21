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
    
    // If the string equals to "" or has a length less than 1 it will just return
    if (str.equals("") || str.length() == 1) {
      return str; 
    }
    
    // the first letter == to the 2nd letter in the string it puts a * inbetween
    else if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    }

    // The first letter + 1st letter in substring 
    else {
      return str.charAt(0) + pairStar(str.substring(1));
    }    

  }

  /**
  * Returns a clean string where there are no duplicates
  *
  * @param String str is the given string
  * @return it will return the string with no duplicates
  * @author J.Cheung
  */

  public static String stringClean(String str) {
    
    // if string length less than 2 return string
    if (str.length() < 2) {
      return str;
    }

    // else if first letter in string == to 2nd letter in the string then return
    // substring the reamining letters after 1 
    else if (str.charAt(0) == str.charAt(1)) {
      return stringClean(str.substring(1));
    }

    // other wise it would return the first letter in stirng + the remainder 
    else {
      return str.charAt(0) + stringClean(str.substring(1));
    }
    
  }
















}
