/* Snippet 1: 
public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 

Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? */

//This Loop runs infinitely because the condition always gets true as the i is decrementing after 1 iteration
//To correct this infinte loop make the i INCREMENTING instead of DECREMENTING

public class InfiniteForLoop { 
    public static void main(String[] args) { 
    for (int i = 0; i < 10; i++) { 
    System.out.println(i); 
    } 
    } 
   }


