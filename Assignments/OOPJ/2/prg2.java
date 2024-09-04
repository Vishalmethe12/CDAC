import java.util.Scanner;

public class prg2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height (meters): ");
        float height = sc.nextFloat();
        System.out.print("Enter your weight (kilogram) : ");
        float weight = sc.nextFloat();

        float bmi = weight / (height * height);
        System.out.print("BMI is: "+bmi);        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25.0 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
           System.out.println("Obesity");
        }
    }
}
