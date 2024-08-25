import java.util.Scanner;
public class discountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total purchase amount (Rs.): ");
        double totalPurchase = sc.nextDouble();

        System.out.print("Do you have a membership card? (1.y/2.n): ");
        int membership = sc.nextInt();
        double discount = 0;

        if (totalPurchase >= 1000) {
            discount = 20; 
        } else if (totalPurchase >= 500) {
            discount = 10; 
        } else {
            discount = 5;  
        }

        if (membership==1) {
            discount += 5;
        }

        double Total_discount = totalPurchase*(discount/ 100) ;
        double Amount = totalPurchase - Total_discount;

        System.out.println("Original Amount: Rs. " + totalPurchase);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs. " + Total_discount);
        System.out.println("Final Amount after Discount: Rs. " + Amount);

    }
}

    
