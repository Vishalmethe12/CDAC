// Snippet 3: 
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 
/* 
 Error to investigate: Why does the loop only
 execute once? What is wrong with the loop condition in the `do-while` loop? 
 Ans: Since it is Do-While loop firstly it iterate through loop and it does not check
 the condition and iterates and then for 2nd iteration it checks the while condition 
 Here the condition gets false and therefore code runs only once */



