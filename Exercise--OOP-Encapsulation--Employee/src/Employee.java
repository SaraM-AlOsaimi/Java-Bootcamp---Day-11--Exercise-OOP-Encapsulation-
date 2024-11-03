public class Employee {

private String id;
private String name;
private int salary;

// Constructor
public Employee(String id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}

// Getters
public String getId() {
    return id;
}

public String getName() {
    return name;
}

public int getSalary() {
    return salary;
}

// Method to calculate annual salary
public int getAnnualSalary() {
    return salary * 12;
}

// Method to raise salary
public int raisedSalary(int percent) {
    if (percent > 0) {
        salary += salary * percent / 100;
    }
    return salary;
}

// Method to return string representation of the employee
@Override
public String toString() {
    return "Employee ID: " + id + ", Name: " + name + ", Monthly Salary: " + salary;
}
















}
