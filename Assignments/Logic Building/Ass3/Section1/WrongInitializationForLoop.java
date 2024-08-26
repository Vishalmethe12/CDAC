/* Snippet 5: 
public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i++) { 
 System.out.println(i); 
 } 
 } 
} 
 Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop? 
Ans: As the intializtion of i is done with 10  it get incremented by 1 after every iteration 
and gets running into infite loop */


public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
    for (int i = 10; i >= 0; i--) { 
    System.out.println(i); 
    } 
    } 
   }
