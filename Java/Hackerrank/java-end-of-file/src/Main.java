import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            Scanner scanner =new  Scanner(System.in);
           int lineNumb = 0;
           
           
           while(scanner.hasNext()){
               lineNumb++;
               System.out.println(""+lineNumb+" "    +scanner.nextLine());
           }
    }
}