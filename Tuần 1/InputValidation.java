import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        int numberIn;
        boolean isValid = false; 
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Enter a number between 0-10 o r 90-100 : ");
            numberIn = scanner.nextInt();
            if(numberIn >= 0 && numberIn <= 10 ) isValid = true;
            else if (numberIn >= 90 && numberIn <= 100 ) isValid = true;
            else System.out.println("Invalid input , try again ...");
        } while (!isValid);
        
        scanner.close();
        System.out.println("You have entered : " + numberIn);
    }
}
