import java.util.*;
public class Q3{
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even integer");
        }else{
            System.out.println(num+" is Odd integer");
        }
    }
}