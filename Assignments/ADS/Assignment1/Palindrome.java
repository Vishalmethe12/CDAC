public class Palindrome {
    public static void PalindromeCheck(int num){
        if(num<=0)
         return ;

        int n=num;
        int revDigit=0;
        while(n!=0){
            int rem=n%10;
            revDigit=revDigit*10+rem;
            n=n/10;
        }
        if(num==revDigit){
            System.out.println("It is palindrome Number");
        }else{
            System.out.println("It is not palindrome Number");

        }
    }
    public static void main(String[] args) {
        int num=121;
        PalindromeCheck(num);
    }
    
}
