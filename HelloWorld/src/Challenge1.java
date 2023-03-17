public class Challenge1 {
    public static void main(String[] args){
        //Step 1
        double num1 = 20;
        //Step 2
        double num2 = 80;
        //Step 3
        double num3 = (num1+num2)*100;
        //Step 4
        double remainderNum = num3%40;
        //Step 5
        boolean isZero = (remainderNum == 0) ? true : false;
        //Step 6
        System.out.println(isZero);
        //Step 7
        if (!isZero) {
            System.out.print("Got some remainder!");
        }
    }
}
