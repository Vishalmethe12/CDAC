/* Snippet 10: 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition? 
Ans: Here the conditon is not boolean and here we are trying to convert int into boolean therfore it 
 runs indefinitly */

 public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
    int num = 10; 
    while (num >0) { 
    System.out.println(num); 
    num--; 
    } 
    } 
   }