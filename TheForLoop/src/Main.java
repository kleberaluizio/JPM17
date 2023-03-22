public class Main {
    public static void main(String[] args) {


        for (int i = 2; i< 6; i++){
            System.out.println(i);
        }
        double [] interests = {2.0,3.0,4.0,5.0};

        for (double interest = 2.0; interest <= 5.0; interest++){
            System.out.println("10,000 at " + interest +"% interest = "+calculateInterest(10000.0,interest));
        }

        // Using For Each
        for (double interest: interests){
            System.out.println("10,000 at " + interest +"% interest = "+calculateInterest(10000.0,interest));
        }
    }
    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
