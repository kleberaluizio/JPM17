public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000){
            System.out.println("Your score was less 5000");
        }else if (score == 5000){
            System.out.println("Your score was 5000");
        }else{
            System.out.println("Your score was greater than 5000");

        }
    }
}