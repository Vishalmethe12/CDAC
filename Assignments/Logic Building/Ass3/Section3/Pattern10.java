public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n*2; i=i+2){
            for(int j=1; j<=n*2; j=j+2){
                if(j>i){
                    break;
                }
                if(j>1){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
