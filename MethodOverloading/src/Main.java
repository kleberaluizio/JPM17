public class Main {
    public static void main(String[] args) {
    calculateScore("Tim",500);
    calculateScore(75);
    calculateScore();

    }

    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }
    public static int calculateScore (int score){
        return calculateScore("Anonymous", score);
    }
    public static int calculateScore (){
        System.out.println("No player scored, no player score. ");
        return 0;
    }
}
