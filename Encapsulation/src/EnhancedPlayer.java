public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName){
        this(fullName,100, "sword");
    }

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon){
        this.fullName = fullName;

        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100){
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.healthPercentage -= damage;
        if (this.healthPercentage <=0){
            System.out.println("Player knocked out of game!");
            //this.healthPercentage = 0;
        }
    }

    public void restoreHealth(int extraHealth){
        this.healthPercentage += extraHealth;
        if (this.healthPercentage > 100){
            System.out.println("Player's healthPercentage is restore to 100!");
        }
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }
}
