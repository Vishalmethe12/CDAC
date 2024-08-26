/* public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
    int count = 5; 
    while (count = 0) { 
    System.out.println(count); 
    count--; 
    } 
    } 
   } 
   Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
   `while` loop? 
   Ans: While loop check the condition in boolean value here we are trying to convert int into boolean to correct 
        it we must write conditon which return either true or false  */


        public class IncorrectWhileCondition { 
            public static void main(String[] args) { 
            int count = 5; 
            while (count >= 0) { 
            System.out.println(count); 
            count--; 
            } 
            } 
           }
