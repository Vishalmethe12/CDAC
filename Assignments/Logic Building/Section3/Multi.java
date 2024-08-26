public class Multi {
    public static void main(String[] args) {
        int num = 7;
        
        for (int i = 0; i <= 100; i++) {
            if(i%num ==  0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
