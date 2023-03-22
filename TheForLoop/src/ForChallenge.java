public class ForChallenge {
    public static void main(String[] args) {

        double amount = 100.0;
        for (double i = 7.5; i <= 10.0 ; i+=0.25){
            double interestAmount = calculateInterest(amount,i);
            if (interestAmount>8.5){
                break;
            }
            System.out.println("100.0 at " + i +"% interest = $" + interestAmount);
        }
    }
    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
