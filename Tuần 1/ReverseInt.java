import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer : ");
        int num = scanner.nextInt();
        
        scanner.close();

        int lastNum;
        String Number = "";
        while (num > 0) {
            lastNum = num % 10;
            Number += lastNum;
            num = num / 10;
        }
        System.out.println("The reverse is : " + Number);
    }
}
