public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Everybody!");
        boolean isAlien =false;
        if (isAlien==false){
            System.out.println("It's not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore =80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore>secondTopScore && topScore<100){
            System.out.println("Greater than second top score and less than 100");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) { // The NOT Operator
            System.out.println("This is not supposed to happen");
        }
        // Ternary Operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen"? false : true;
        //         boolean isDomestic = (makeOfCar != "Volkswagen")
        if (isDomestic) {
            System.out.println(isDomestic);
            System.out.println("This car is domestic to our country");
        }
        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? " over Eighteen1" : "Still a kid!";
        System.out.println("Our client is" + ageText);
    }
}
