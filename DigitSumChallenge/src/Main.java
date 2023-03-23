public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));


    }
    public static int sumDigits (int value){
        int sum = 0;
        if (value < 0){
            return -1;
        } else {
            while (value / 10 != 0){
                sum = sum + (value % 10);
                value = value / 10;
            }
            return (sum + value);
        }
    }
}
