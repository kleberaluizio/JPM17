public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(){
        this("Default Name", "Default email");
    }

    public Customer(String name,String emailAddress){
        this(name,100.90, emailAddress);
    }

    public Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String presentation() {
        return  "name = " + name + "\n" +
                "creditLimit = " + creditLimit +"\n"+
                "emailAddress = " + emailAddress + "\n";
    }

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
}
