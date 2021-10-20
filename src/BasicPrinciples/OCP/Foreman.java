package BasicPrinciples.OCP;

public class Foreman implements EmployeeInterface {
    int salary = 3000;

    @Override
    public void paySalary() {
        System.out.println("Foreman Salary = " + salary);
    }
}
