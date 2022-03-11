import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        int inNum = Integer.parseInt(scanner.next());

        scanner.close();

        //loop and print
        int DecNum = 0;
        int lastNum;
        int base = 1;
        boolean isBinary = false;
        while (inNum > 0) {
            lastNum = inNum % 10;
            inNum = inNum / 10;
            if (lastNum == 1 || lastNum == 0) {
                DecNum += lastNum * base;
                base *= 2;
                isBinary = true;
            } else {
                System.out.println("error: invalid binary string " + inNum);
                isBinary = false;
                break;
            }
        }
        if (isBinary) {
            System.out.println("The equivalent decimal number for binary " + inNum + " is: " + DecNum);
        }
    }
}
