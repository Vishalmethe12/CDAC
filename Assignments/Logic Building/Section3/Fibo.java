public class Fibo {
    public static void main(String[] args) {
       
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        int c;
        for (int i = 2; i < 21; i++) {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();

        
    }
}
    

