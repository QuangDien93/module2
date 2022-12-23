package phuongtrinhbac2;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2 +  bx + c \n" + "Enter the a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the b:");
        double b = scanner.nextDouble();
        System.out.println("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("the Equation has 2 roots:");
            System.out.println("the root1 is: " + quadraticEquation.getRoot1());
            System.out.println("the root2 is: " + quadraticEquation.getRoot2());
        } else {
            if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("the Equation has 1 roots: " + quadraticEquation.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
