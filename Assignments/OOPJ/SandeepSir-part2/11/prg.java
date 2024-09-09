public class prg{
    public static void main(String[] args) {

            int num1 = Integer.parseInt(args[0]);
            char operator = args[1].charAt(0);
            int num2 = Integer.parseInt(args[2]);

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                     
                        System.out.println("Result: " + (num1 / num2));
                        break;
                default:
                    System.out.println("Error: Invalid operator. Use +, -, *, or /.");
                    break;
            }
        } 
 }
