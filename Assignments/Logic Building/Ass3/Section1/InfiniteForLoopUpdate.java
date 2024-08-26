/* Snippet 9: 
public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 
 Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected?
Ans: Here the update statement is incrementing the i value by 2 it must be increamneted by 1 */

public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
    for (int i = 0; i < 5; i += 1) { 
    System.out.println(i); 
    } 
    } 
   }