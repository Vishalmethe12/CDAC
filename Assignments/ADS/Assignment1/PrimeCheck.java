public class PrimeCheck {
    static boolean status; 
    public static void primeCheck(int num){
        int count=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
               count++;
            }
        }
        if(count>1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
    public static void main(String[] args) {
        int num=17;
        PrimeCheck.primeCheck(num);
    }
}
