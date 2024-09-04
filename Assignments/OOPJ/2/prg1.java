import java.util.*;
class prg1{
	public static void main(String[] args){
			System.out.print("Enter Year:");
			
			Scanner sc= new Scanner(System.in);
			int year = sc.nextInt();
			int status ;
			
			if(year%4 == 0 ||  year%100!=0 && year%400==0 )
						{
							status=1;
						}
			 else
			 {
				 status=2;
			 }
			switch(status)
			{
				case 1: 
					System.out.println("Leap year");
					break;
				case 2:	
					System.out.println("Not a Leap year");
					break;
				default:
					System.out.println("Invalid year");
					break;
			}
		
			
		
		// }	
	}
}