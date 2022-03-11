import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number : " );
        int Num = scanner.nextInt();
        
        scanner.close();

        int lastNum;
        while (Num > 0) {
            lastNum = Num % 10;
            System.out.print(lastNum + " ");
            Num = Num / 10;
        }
    }
}
