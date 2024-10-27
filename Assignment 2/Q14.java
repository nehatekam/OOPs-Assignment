import java.util.Scanner;

class Employee{
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.basic_salary=basic_salary;
        calculateGrossSalary();
    }
    private void  calculateGrossSalary(){
        double hra = 0.10 *basic_salary;
        double da = 0.5*basic_salary;
        gross_salary=basic_salary+hra+da;

    }
    public void displayDetial(){
        System.out.println("Employee Id : "+emp_id);
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee Salary : "+basic_salary);
        System.out.println("Employee gross Salary : "+gross_salary);
    }
}
public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine(); 
        scanner.nextLine();
        System.out.print("Enter Employee Salary : ");
        double basic_salary = scanner.nextDouble(); 
        scanner.nextLine();
        Employee employee = new Employee(emp_id, emp_name, basic_salary);
        employee.displayDetial();;
        scanner.close();
    }
}
