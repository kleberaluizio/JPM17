public class PositiveNegativeZero {
     public static void main(String[] args){
         checkNumber(1);
         checkNumber(0);
         checkNumber(-100);


     }

     public static void checkNumber(int number) {
         if (number > 0) {
             System.out.println("Positive");

         } else if (number < 0){
             System.out.println("Negative");
         }else{
             System.out.println("Zero");
         }
     }
}
