package Stream_API;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CrudEmployee {
    private static final Scanner percentIncrease = new Scanner(System.in);
    public static Stream<Employee> incrementSalary(Stream<Employee> employees) {
        System.out.println("Enter the percentage to increase the salary:");
        double percentage = percentIncrease.nextDouble();
        return employees.peek(employee -> {
            double newSalary = employee.getSalary() + (employee.getSalary() * (percentage / 100));
            employee.setSalary(newSalary);
        });
    }

    public static Stream<Employee> addNewEmployee(Stream<Employee> employeeStream){
        List<Employee> employeeList = employeeStream.collect(Collectors.toList());
        Scanner input = new Scanner(System.in);
            System.out.println("Enter first name:");
            String firstName = input.nextLine();
            System.out.println("Enter last name:");
            String lastName = input.nextLine();
            System.out.println("Enter salary:");
            double salary = input.nextDouble();
            input.nextLine();
            System.out.println("Enter projects:");
            String projects = input.nextLine();

            Employee employee = new Employee(firstName, lastName, salary, projects);
            employeeList.add(employee);
        Stream<Employee> addedEmployeeStream = employeeList.stream();
        return addedEmployeeStream;
    }
}
