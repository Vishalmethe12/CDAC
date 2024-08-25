import java.util.Scanner;
public class calculator {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter operation (1.+,\t 2.-,\t 3. *,\t 4. /): ");
        int operator = sc.nextInt();

        // Perform the calculation based on the operator
        switch(operator) { 
            case 1: 
                System.out.println("Result: " + (num1 + num2));
                break; 
            case 2: 
                System.out.println("Result: " + (num1 - num2));
                break; 
            case 3: 
                System.out.println("Result: " + (num1 * num2));
                break; 
            case 4: 
                if (num2 != 0) { 
                    System.out.println("Result: " + (num1 / num2)); 
                } else { 
                    System.out.println("Error: Division by zero is not allowed.");
                } 
                break; 
            default: 
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break; 
        } 
        
    } 
}

    
