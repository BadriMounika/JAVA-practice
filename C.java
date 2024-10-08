package firstjava;


import java.util.Scanner;
public class C {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers and an operator
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        boolean validOperation = true;
        
        // Perform calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}


