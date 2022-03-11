import java.util.*;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number : " );
        int number = scanner.nextInt();
        
        scanner.close();
        System.out.println("The number is : " + number);

        //if-else
        if(number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE!");
    }
}