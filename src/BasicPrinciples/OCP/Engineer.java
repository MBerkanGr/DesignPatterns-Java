package BasicPrinciples.OCP;

public class Engineer implements EmployeeInterface {
    int salary = 5000;

    @Override
    public void paySalary() {
        System.out.println("Enginerr Salary = " + salary);
    }
}
