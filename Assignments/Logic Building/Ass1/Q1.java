import java.util.*;
public class Q1{
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num+" is Postive integer");
        }else{
            System.out.println(num+" is Negative integer");
        }
    }
}