package BasicPrinciples.OCP;

public class Architect implements EmployeeInterface {
    int salary = 5000;

    @Override
    public void paySalary() {
        System.out.println("Architect Salary = " + salary);
    }
}
