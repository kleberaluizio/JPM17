public class Main {
    public static void main (String[] args){
        String currentYear = "2023";
        String usersDateOfBirth = "1993";
        // Integer is a Wrapper Class
        System.out.println("Age = "+ (Integer.parseInt(currentYear) -  Integer.parseInt(usersDateOfBirth)));


        String doubleNumber1  = "2.22";
        String doubleNumber2  = "2.5";

        System.out.println(Double.parseDouble(doubleNumber1) + Double.parseDouble(doubleNumber2) );

    }
}
