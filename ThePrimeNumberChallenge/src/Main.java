public class Main {
    public static void main(String[] args) {

        int count = 0;
        int range = 1000;
        for (int i = 0; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number.");
                count++;
            }
        }
        System.out.println("There is "+ count + " primes until "+ range );
    }
    public static boolean isPrime (int wholeNumber){

        if (wholeNumber <= 2){
          //  return (wholeNumber == 2);
            return false;
        }
        for (int divisor = 2; divisor < wholeNumber/2; divisor++){
            if (wholeNumber % divisor ==0){
                return false;
            }
        }
       return true;
    }
}
