package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean keepAdding = true;
        while (keepAdding) {
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
            System.out.println("Do you want to add more Employee?(y/n)");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                keepAdding = false;
            }
        }
        while (true) {
            System.out.println(
                    """
                                    
                               Enter the Value for the operation you want to perform :
                                    1. Increase Salary by Percent
                                    2. Add New Employee
                                    3. Exit
                                        
                            """
            );

            int task = input.nextInt();
            switch (task) {
                case 1 -> {
                    Stream<Employee> employeeStream = employeeList.stream();
                    Stream<Employee> incrementedSalaryStream = CrudEmployee.incrementSalary(employeeStream);
                    List<Employee> incrementedEmployeeList = incrementedSalaryStream.toList();
                    incrementedEmployeeList.forEach(System.out::println);
                }
                case 2 -> {
                    Stream<Employee> employeeStream = employeeList.stream();
                    Stream<Employee> addedEmployeeStream = CrudEmployee.addNewEmployee(employeeStream);
                    List<Employee> addedEmployeeList = addedEmployeeStream.toList();
                    addedEmployeeList.forEach(System.out::println);
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
