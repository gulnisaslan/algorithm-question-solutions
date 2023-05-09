import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfLine = input.nextInt();
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        
        for (int i = 0; i <numOfLine; i++) {
            int num = input.nextInt();
            ArrayList<Integer> integers =new ArrayList<>();
            for (int j = 0; j <num; j++) {
                integers.add( new Integer(input.nextInt()));
                
            }
            list.add(integers);
            input.nextLine();
            
        }
            int numQueries = Integer.parseInt(input.nextLine());
        for(int i=0;i<numQueries;i++){
            int x = input.nextInt()-1;
            int y = input.nextInt()-1;
            input.nextLine();
            if(x<list.size() && y<list.get(x).size()){
                System.out.println(list.get(x).get(y));
            }else{
                    System.out.println("ERROR!");
                }
        }
    }
}
