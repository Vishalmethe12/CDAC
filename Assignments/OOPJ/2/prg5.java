import java.util.Scanner;

public class prg5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int ch = sc.nextInt();

        float area = 0;

        switch (ch) {
            case 1: 
                System.out.print("Enter the radius of the circle: ");
                float radius = sc.nextFloat();
                area = (float)Math.PI * radius * radius;
                break;

            case 2: 
                System.out.print("Enter the side length of the square: ");
                float side = sc.nextFloat();
                area = side * side;
                break;

            case 3: 
                System.out.print("Enter the width of the rectangle: ");
                float width = sc.nextFloat();
                System.out.print("Enter the height of the rectangle: ");
                float height = sc.nextFloat();
                area = width * height;
                break;

            case 4: 
                System.out.print("Enter the base of the triangle: ");
                float base = sc.nextFloat();
                System.out.print("Enter the height of the triangle: ");
                float THeight = sc.nextFloat();
                area = (float)(0.5 * base * THeight);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("The area is "+ area);
    }s
}
