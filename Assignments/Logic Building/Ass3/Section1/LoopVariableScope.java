/*Snippet 12: 
public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
 Error to investigate: Why does the variable 'x' cause a compilation error? How does scope 
 Ans: Here the x is declare in for loop .Every time loop gets exectuted it is destroyed and again created 
 and its scope is till for loop only we cannot acces it outside loop*/

 public class LoopVariableScope { 
    public static void main(String[] args) {
    int x=0; 
    for (int i = 0; i < 5; i++) { 
     x = i * 2; 
    } 
    System.out.println(x); // Error: 'x' is not accessible here 
    } 
   }