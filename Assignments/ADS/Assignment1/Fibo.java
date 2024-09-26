import java.util.Scanner;

public class Fibo {

    static int fibo(int num){
        if(num<2)
            return num;
        
        return fibo(num-1)+fibo(num-2);
    }

    public static void main(String[] args) {
    System.out.println("Enter the Nth index");
    java.util.Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        
       for(int i=1;i<=n;i++)
        System.out.print(Fibo.fibo(i)+" ");
    }
    
}
