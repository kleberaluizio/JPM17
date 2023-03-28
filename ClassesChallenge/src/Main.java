public class Main {
    public static void main(String[] args) {

        BankAccount firstClient = new BankAccount();
        firstClient.withdrawFunds(100);

        firstClient.setAccountNumber("0012");
        firstClient.setAccountBalance(1000);
        firstClient.setCustomerName("Kleber Aluizio");
        firstClient.setCustomerEmail("kleberaluizio@gmail.com");
        firstClient.setPhoneNumber(996407768);

        System.out.println(firstClient.toString());

        firstClient.depositFunds(200);

        firstClient.withdrawFunds(725.25);

        firstClient.withdrawFunds(725.25);

    }
}
