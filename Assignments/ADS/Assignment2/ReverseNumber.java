public class ReverseNumber {
    public static int reverse(int num){
        if(num==0){
            return 0;
        }
        return num%10+reverse(num/10);
        
    }
    public static void main(String[] args) {
        reverse(12345);
    }
}
