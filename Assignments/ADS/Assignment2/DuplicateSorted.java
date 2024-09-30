public class DuplicateSorted {
    
    public static void rmvDupliCate(int arr[],int n){
         
    }
    public static void main(String[] args) {
        int[] arr=new int[]{0, 0, 1, 1, 2, 2, 3, 3};
        int arrSize=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[arrSize++]=arr[i];
            }
   
        
    }
    System.out.println("new Array length:"+arrSize);
}
}
