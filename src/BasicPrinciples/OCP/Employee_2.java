package BasicPrinciples.OCP;

public class Employee_2 {
    public static void main(String[] args) {
        paySalary(new Engineer());
        paySalary(new Chef());
    }

    static void paySalary(EmployeeInterface employee){
        employee.paySalary();
    }
}
