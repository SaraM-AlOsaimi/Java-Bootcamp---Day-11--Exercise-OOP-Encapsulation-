//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("1293847","sara",10000);

        System.out.println(employee);

        System.out.println("Annual Salary: " + employee.getAnnualSalary());

        employee.raisedSalary(10);
        System.out.println("New Salary after 10% raise: " + employee.getSalary());

        System.out.println(employee);

    }
}