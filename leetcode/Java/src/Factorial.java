/**
 * Factorial
 */
public class Factorial {

    public static int factorial(int n) {
        // Write your code here
        
          if(n <= 1){
              return n;
          }else{
              return n * factorial(n-1);
          }
       
    
        }
}