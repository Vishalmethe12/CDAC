public class NonRepeat {
    public static void nonRepeat(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(i==j){
                    continue;
                }
                char ch1=str.charAt(j);
                
                if(ch==ch1){
                    count++;
                    continue;
                }
                
            }
            if(count==0){
                System.out.println(ch);
                break;
            }
           
    }
}
    public static void main(String[] args) {
        String str="stress";
        NonRepeat.nonRepeat(str);
    }

    
}
