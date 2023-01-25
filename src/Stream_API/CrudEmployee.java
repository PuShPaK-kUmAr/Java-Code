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
        return employeeList.stream();
    }

    public static Stream<Employee> deleteEmployee(Stream<Employee> employeeStream){
            List<Employee> employeeList = employeeStream.collect(Collectors.toList());
        try {
            Scanner inputFirstName = new Scanner(System.in);
            System.out.println("Enter Employee firstName to delete Employee from list : ");
            String name = inputFirstName.nextLine();
            employeeList.removeIf(e -> e.getFirstName().equalsIgnoreCase(name));
            System.out.println("Remaining Employee in the List are : \n");
            return employeeList.stream();
        } catch (Exception e){
            System.out.println("Error : "+ e.getMessage());
            return employeeList.stream();
        }
    }

}
