public class LeapYear {

    public static void leapYearCheck(int year){
        if(year%4==0 || year%400==0 && year%100==0){
            System.out.println("It is leap year");
        }else{
            System.out.println("It is not leap year");

        }
    }

    public static void main(String[] args) {
        int year=2020;
        leapYearCheck(year);
    }

    
}
