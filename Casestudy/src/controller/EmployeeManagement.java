package controller;

import model.Employee;
import services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    public static void displayEmployMenu() {
        System.out.println("Employee Management :\n" +
                "1. Display list employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Return main menu\n");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

        switch (select) {
            case "1":
                employeeServiceImpl.display();
                break;
            case "2":
                Employee employee = new Employee();
                employee.inputEmploy();
                employeeServiceImpl.addEmploy(employee);
                break;
            case "3":
                System.out.println("Code of Employee?");
                employeeServiceImpl.editEmployByCode(scanner.nextInt());
                break;
            case "4":
                FuramaController.displayMainMenu();
                break;
            default:
                System.out.println("please choose form 1 to 4");
                displayEmployMenu();

        }
        displayEmployMenu();
    }

}
