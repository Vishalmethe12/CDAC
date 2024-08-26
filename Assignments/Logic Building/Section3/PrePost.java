public class PrePost {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        int z = ++x + y++;
        System.out.println(x); 
        System.out.println(y); 
        System.out.println(z); 
    }    
}
