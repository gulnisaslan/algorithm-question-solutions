public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bi = new BigInteger(n);
        System.out.println(bi.isProbablePrime(10) ? "prime" : "not prime");
        bufferedReader.close();
        
    
    }
}
