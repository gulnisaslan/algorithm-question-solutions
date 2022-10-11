import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest = largest = s.substring(0, k);
        
        for (int i = 1; i < s.length()-k+1; i++) {
            String subStrings = s.substring(i, i+k);
            if (smallest.compareTo(subStrings)>0) {
                smallest = subStrings;
            }
            if(largest.compareTo(subStrings)<0){
                largest = subStrings;
            }
          
        } 
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}