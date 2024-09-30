public class ReverseString {
    public static void reverse(String str){
        if(str==""){
            return ;
        }
        reverse(str.substring(1));

        System.out.print(str.charAt(0));
    }
    public static void main(String[] args) {
        String str="java";
        reverse(str);
    }
    
}
