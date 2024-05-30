package EmployeeManagerSystem;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("ABC", 21, "1234512345", "Address one, 503423",120000);
        Manager member = new Manager("XYZ", 25, "6789067890", "Address Two, 382044", 500000, "Sales");

        System.out.println("Employee salary: "+employee.getSalary());
        System.out.println("Member salary: "+member.getSalary());

        System.out.println(employee);
        System.out.println(member);
    }

}
