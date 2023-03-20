public class Main {
    public static void main(String[] args){
        System.out.println("68 in = " + convertToCentimeters(68) + " cm");
        System.out.println("5ft, 8 in = " + convertToCentimeters(5,8) + " cm");
    }
    public static double convertToCentimeters(int heightInInch){

        return heightInInch * 2.54;// 1 inch = 2.54 cm
    }
    public static double convertToCentimeters(int feet, int inches){

        return convertToCentimeters((feet * 12) + inches);
    }
}
