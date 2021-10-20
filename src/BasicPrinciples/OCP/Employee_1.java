package BasicPrinciples.OCP;

public class Employee_1 {
    enum EmployeeType {
        FOREMAN,
        ENGINEER,
        CHEF,
        ARCHITECT
    }

    public static void paySalary(EmployeeType type){
        switch (type){
            case CHEF:
                System.out.println("Chef Salary = 3500");
                break;
            case FOREMAN:
                System.out.println("Foreman Salary = 2500");
                break;
            case ENGINEER:
                System.out.println("Engineer Salary = 5500");
                break;
            case ARCHITECT:
                System.out.println("Architect Salary = 5500");
                break;
        }
    }

    public static void main(String[] args) {
        paySalary(EmployeeType.ENGINEER);
        paySalary(EmployeeType.CHEF);
    }
}
