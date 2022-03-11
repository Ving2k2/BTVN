import java.util.*;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day number : ");
        int dayNumber = scanner.nextInt();
        
        scanner.close();

        // if-else
        if (dayNumber == 0) {
            System.out.println("Monday8");
        } else if (dayNumber == 1) {
            System.out.println("Tuesday");
        } else if (dayNumber == 2) {
            System.out.println("Wednesday");
        } else if (dayNumber == 3) {
            System.out.println("Thursday");
        } else if (dayNumber == 4) {
            System.out.println("Friday");
        } else if (dayNumber == 5) {
            System.out.println("Saturday");
        } else if (dayNumber == 6) {
            System.out.println("Sunday");
        } else  {
            System.out.println("Not a valid day");
        }     
    }
}
