public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "dell","240");
        Monitor theMonitor = new Monitor("27 inch Beast","Acer",27,"2540 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");

        PersonalComputer thePc = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherBoard);

//        thePc.getMonitor().drawPixelAt(10,10,"red");
//        thePc.getMotherBoard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();
        thePc.powerUp();
        thePc.runProgram("JDK 17");

    }
}
