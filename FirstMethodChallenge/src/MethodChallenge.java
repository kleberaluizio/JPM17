public class MethodChallenge {
    public static void main(String[] args){
        String name = "Kleber";
        int score =     1500;

        displayHighScorePosition(name,calculateHighScorePosition(score));
        displayHighScorePosition("Nari",calculateHighScorePosition(1000));
        displayHighScorePosition("Rodrigo",calculateHighScorePosition(500));
        displayHighScorePosition("Luana",calculateHighScorePosition(100));
        displayHighScorePosition("Rafael",calculateHighScorePosition(25));

    }
    public static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName + " managed to get into position "+playerPosition+" on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
