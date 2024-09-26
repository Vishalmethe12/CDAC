public class GCD{
    public static int GCD(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return GCD(num2,num1%num2);
    }

    public static void main(String[] args) {
        int num1=54;
        int num2=24;
        System.out.println(GCD.GCD(num1, num2));

    }
    
}
