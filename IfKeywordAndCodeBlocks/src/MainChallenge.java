public class MainChallenge {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int yearOfBirth = 1993;
        int age = calculateMyAge(yearOfBirth);
        System.out.println("I was born in "+yearOfBirth+ ", I am " + age + " years old.");
    }
    public static void calculateScore(boolean gameOver,int score, int levelCompleted,int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted*bonus);
            System.out.println("Your final score was "+ finalScore);
        }
    }
    public static int calculateMyAge(int yearOfBirth){
        return (2023-yearOfBirth);
    }
}