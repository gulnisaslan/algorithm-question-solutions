public class Main {
    static int B,H;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     
         if(flag){
            int area=B*H;
            System.out.print(area);
        } 
         
}
