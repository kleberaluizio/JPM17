public class Main {
    public static void main(String[] args) {

        Player player = new Player();

/*
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining = " + player.healthRemaining());
        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining = " + player.healthRemaining());
*/
        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"sword");
        System.out.println("Initial healt is " +tim.healthRemaining());
    }
}
