package model;

import java.util.Scanner;

public class Employee extends Person {
    static int count = 0;
    private int employeeCode;
    private String employeeLevel;
    private String employeePosition;
    private double employeeSalary;

    public Employee() {
        this.setEmployeeCode(++count);
    }

    public Employee(String name, String birthday, String IDCode, String phoneNumber, String email, int employeeCode, String employeeLevel, String employeePosition, double employeeSalary) {
        super();
        this.employeeCode = ++count;
        this.employeeLevel = employeeLevel;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public void inputEmploy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("idCode");
        this.setIdCode(scanner.nextLine());
        System.out.println("name");
        this.setName(scanner.nextLine());
        System.out.println("phone");
        this.setPhoneNumber(scanner.nextLine());
        System.out.println("birthday:");
        this.setBirthday(scanner.nextLine());
        System.out.println("email");
            while (true){
                if(this.setEmail(scanner.nextLine())){
                    break;
                }
                System.out.println("Enter Email again!!");
            }
        this.setEmail(scanner.nextLine());
        System.out.println("level");
        this.setEmployeeLevel(scanner.nextLine());
        System.out.println("position");
        this.setEmployeeLevel(scanner.nextLine());
        System.out.println("salary");
        this.setEmployeeSalary(scanner.nextDouble());
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", employeeLevel='" + employeeLevel + '\'' +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}' + super.toString();
    }
}
