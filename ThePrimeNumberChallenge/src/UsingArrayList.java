import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int count = 0;
        int initialValue = 200;
        int finalValue = 1000;

        // Finding the first 3 primes greater than a given value
        for (int i = initialValue; i <= finalValue; i++) {
            if (isPrime(i)) {
                lista.add(i);
                count++;

                if (count == 3) {
                    break;
                }
            }
        }
        System.out.println("Prime Numbers");
        System.out.println(lista);

        //System.out.println("There is "+ count + " primes until "+ finalValue );
        count = 0;
        // Another way
        for (int i = initialValue; count == 3 && i <= finalValue; i++) {
            if (isPrime(i)) {
                lista.add(i);
                count++;
            }
        }
        System.out.println("Prime Numbers");
        System.out.println(lista);

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
