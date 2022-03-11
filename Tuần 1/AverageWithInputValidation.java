import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isValid;
        int sum = 0;
        for (int studentID = 1; studentID <= 3; ++studentID) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + studentID + " : ");
                int mark = scanner.nextInt();
                if (mark >= 0 && mark <= 100) {
                    isValid = true;
                    sum += mark;
                } else System.out.println("Invalid input , try again ...");
            } while (!isValid);
        }
        
        scanner.close();
        
        double averge = (double) sum / 3;
        System.out.printf("The average is : %.2f%n " , averge);
    }
}
