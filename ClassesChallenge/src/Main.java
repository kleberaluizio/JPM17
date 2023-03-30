public class Main {
    public static void main(String[] args) {

        BankAccount firstClient = new BankAccount("0012",500,"Kleber","kleberaluizio@gmail.com","(47)996407768");
        firstClient.withdrawFunds(100);
        firstClient.depositFunds(250);
        firstClient.withdrawFunds(50);
        firstClient.withdrawFunds(200);
        firstClient.depositFunds(100);
        firstClient.withdrawFunds(45.55);
        firstClient.withdrawFunds(54.46);
        firstClient.withdrawFunds(54.45);



        System.out.println(firstClient.toString());
        System.out.println("--------------");
        BankAccount bobsAccount = new BankAccount();
        System.out.println(bobsAccount.toString());

        System.out.println("--------------");
        BankAccount narisAccount = new BankAccount("Nariana","Nariana@gmail.com","479900030");
        System.out.println(narisAccount.toString());

    }
}
