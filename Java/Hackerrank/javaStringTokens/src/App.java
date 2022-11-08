public class App {
    public static void main(String[] args) {
        Scanner Appscan = new Scanner(System.in);
        
        if (!scan.hasNext()) {
            System.out.println(0);
        } else {
            String s = scan.nextLine();
        String[] as = s.trim().split("[ !,?._'@]+");
        System.out.println(as.length);
        for (int i = 0; i < as.length; i++) {
            System.out.println(as[i]);
        }
        }
        
       
        
      
        scan.close();
    }
}
