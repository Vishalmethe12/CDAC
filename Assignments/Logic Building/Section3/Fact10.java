public class Fact10 {
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+number+" : "+ factorial);
    
}
}