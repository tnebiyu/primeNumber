public class myClass {
    public static void main(String[] args) {
        System.out.println(isPrime(22));

    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;

        }
        for (int i = 2; i <=n/2;i++){
            if (n%i ==0){


            System.out.println("it is prime number");
            return true;
        }
        }


        return false;
    }}
