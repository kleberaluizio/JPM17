public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireData, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireData);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public Boolean isRetired(){
        this.isRetired = true;
    }
}
