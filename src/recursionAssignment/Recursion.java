package recursionAssignment;

public class Recursion{

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


}
