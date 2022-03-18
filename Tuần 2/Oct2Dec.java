import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Octal string: ");
        int inNum = Integer.parseInt(scanner.next());

        scanner.close();

        //loop and print
        int decNum = 0;
        int lastNum;
        int base = 1;

        while (inNum > 0) {
            lastNum = inNum % 10;
            inNum = inNum / 10;
            decNum += lastNum * base;
            base *= 8;
        }
        System.out.println("The equivalent decimal number " + inNum + " is: " + decNum); 
    }
}
