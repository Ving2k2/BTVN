import java.util.*;

public class CheckPassFail {
    public static void main(String[] args) { // Program entry point
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of mark : " );
        int mark = scanner.nextInt(); // Set the value of " mark "
        
        scanner.close();
        
        // if-else
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
