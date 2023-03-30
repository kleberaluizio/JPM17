public class Main {
    public static void main(String [] args){
        for(int i = 1; i <= 5; i++){
            Student s = new Student("S92300" + i,
                    switch (i){
                        case 1: yield  "Mary";
                        case 2: yield "Carol";
                        case 3: yield "Tim";
                        case 4: yield "Harry";
                        case 5: yield "Lisa";
                        default:yield "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);

        }
    }
}
