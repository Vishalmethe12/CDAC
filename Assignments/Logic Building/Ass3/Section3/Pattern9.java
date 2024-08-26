public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=5; j>0; j--){
                if(j<n-i){
                    break;
                }
                if(j<5){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
