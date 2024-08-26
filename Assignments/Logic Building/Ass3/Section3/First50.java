public class First50{
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=50; i++ ) {
            sum = sum + i;
        }
        System.out.print("sum of the first 50 natural numbers :");
        System.out.println(sum);

    }
}