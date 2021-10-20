package BasicPrinciples.OCP;

public class Chef implements EmployeeInterface{
    int salary = 3500;

    @Override
    public void paySalary() {
        System.out.println("Chef Salary = " + salary);
    }
}
