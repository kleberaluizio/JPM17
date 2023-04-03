public class Employee extends Worker{

    private long employeeId;
    private String hireData;
    private static int employeeNumber = 1;

    public Employee(){

    }

    public Employee(String name, String birthDate , String hireData) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNumber++;
        this.hireData = hireData;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireData='" + hireData + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
