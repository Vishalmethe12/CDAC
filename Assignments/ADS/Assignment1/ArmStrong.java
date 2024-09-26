public class ArmStrong {
    private static int sum=0;
        public static void armStrongNum(int num){
            if(num==0){
                return; 
            }
                int rem=num%10;
                sum=sum+rem*rem*rem;
                armStrongNum(num/10);
            }  

        public static void main(String[] args) {
            int num=153;
            ArmStrong.armStrongNum(num);
            if(num==sum){
                System.out.println("Number is Armstrong");
            }else{
                System.out.println("Number is not Armstrong");
            }

        } 
}