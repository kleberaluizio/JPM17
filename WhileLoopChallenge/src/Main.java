public class Main {
    public static void main(String[] args) {

        int i = 4;
        int evenCount = 0;
        int oddCount = 0;
        while (i <= 20){
            i ++;
            if (!isEvenNumber(i)) {
                oddCount ++;
                continue;
            }
            System.out.println(i + " is even !");
            evenCount ++;
            if (evenCount >= 5){
                break;
            }
        }
        System.out.println("Found " + evenCount + " even numbers and "+ oddCount + " odd numbers!");
    }

    public static boolean isEvenNumber (int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
