public class ReplaceInPlace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int left=0;
        int right=arr.length-1;
        int temp;
        
        while(left<right){
            temp=arr[right];
            arr[right--]=arr[left];
            arr[left++]=temp;
    }
    for(int x:arr){
        System.out.print(x+" ");
    }
    
}
}
