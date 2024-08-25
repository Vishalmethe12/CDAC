import java.util.*;
public class daysOfWeek {
        public static void main(String[] args) { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the day number");
            int dayNumber=sc.nextInt();

            switch(dayNumber) { 
                case 1: 
                    System.out.println("Monday");
                    System.out.println("WeekDay");
                    break; 
                case 2: 
                    System.out.println("Tuesday");
                    System.out.println("WeekDay");
                    break; 
                case 3: 
                    System.out.println("Wednesday");
                    System.out.println("WeekDay");
                    break; 
                case 4: 
                    System.out.println("Thursday");
                    System.out.println("WeekDay");
                    break; 
                case 5: 
                    System.out.println("Friday");
                    System.out.println("WeekDay");
                    break; 
                case 6: 
                    System.out.println("Saturday");
                    System.out.println("WeekEnd");
                    break; 
                case 7: 
                    System.out.println("Sunday");
                    System.out.println("WeekEnd");
                    break; 
                default: 
                    System.out.println("Invalid day number");
                    break; 
            } 
        } 
        
    }

