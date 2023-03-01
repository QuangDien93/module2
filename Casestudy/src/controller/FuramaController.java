package controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            Scanner scanner = new Scanner(System.in);
            String optionMain = scanner.next();
            switch (optionMain){
                case "1":
                    EmployeeManagement.displayEmployMenu();
                    break;
                case "2":
                    CustomerManagement.display();
                    break;
                case "3":
                    BookingManagerment.display();
                    break;
                case "4":
                    FacilityManagement.display();
                    break;
                case "5":
                    PromotionManagement.display();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Please enter again");
                    displayMainMenu();
            }
    }
}
