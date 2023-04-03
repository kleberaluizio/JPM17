public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }



    public double getDoublePay(){
        return 2*(getHourlyPayRate());
    }

    public double getHourlyPayRate(){
        return this.hourlyPayRate;
    }
}
