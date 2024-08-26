/* Snippet 8: 
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 
Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the 
numbers from 1 to 5?  
Soln: In the Do-While update statement is decrementing therefore it is printing unexpected output*/

public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
    int num = 1; 
    do { 
    System.out.println(num); 
    num++; 
    } while (num<6); 
    } 
   }