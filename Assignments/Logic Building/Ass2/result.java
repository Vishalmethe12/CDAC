import java.util.Scanner;
public class result{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade for Subject 1: ");
        int grade1 = sc.nextInt();
        
        System.out.print("Enter grade for Subject 2: ");
        int grade2 = sc.nextInt();
        
        System.out.print("Enter grade for Subject 3: ");
        int grade3 = sc.nextInt();

        int failedSubjects = 0;
        if (grade1 <= 40) {
            failedSubjects++;
        }
        if (grade2 <= 40) {
            failedSubjects++;
        }
        if (grade3 <= 40) {
            failedSubjects++;
        }
        if (failedSubjects == 0) {
            System.out.println("The student is PASSED.");
        } else {
            System.out.println("The student is FAILED in " + failedSubjects + " subject(s).");
        }

    }
}

