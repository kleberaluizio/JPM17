public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireData, double hourlyPayRate) {
        super(name, birthDate, hireData);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        double payCheck = 40 * hourlyPayRate;
        return payCheck;

    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

}
