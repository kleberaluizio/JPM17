public class Main {
    public static void main(String [] args){
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
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
        Student pojoStudent = new Student("S923006","Ann","05/11/1985","Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007","Bill","05/11/1985","Java Masterclass");
        System.out.println("-----------------");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 82");
        //  recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 82");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


    }
}
