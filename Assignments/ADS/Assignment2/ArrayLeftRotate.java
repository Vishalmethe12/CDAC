import java.util.Scanner;


public class ArrayLeftRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        reverse(arr, 0, arr.length-1);

    }
    
    public static void reverse(int[] arr,int left,int right){
        int  temp;
        while (left<right) {
            temp=arr[right];
            arr[right--]=arr[left];
            arr[left++]=temp;
    }
    for(int x:arr){
        System.out.print(x+" ");
    }
        }
    }

