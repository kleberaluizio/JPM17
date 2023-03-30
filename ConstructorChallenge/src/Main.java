public class Main {
    public static void main(String[] args){

        Customer tim = new Customer("Tim", 1000, "tim@email.com");
        System.out.println(tim.presentation());
        Customer bob = new Customer();
        System.out.println(bob.presentation());
        Customer joe = new Customer("Joe","sisa@email.com");
        System.out.println(joe.presentation());

    }
}
