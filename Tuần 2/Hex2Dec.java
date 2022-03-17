import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Hexadecimal string: ");
        String inStr = scanner.next();

        scanner.close();

        //loop and print
        String digits = "0123456789ABCDEF";  
        int inStrLen = inStr.length();
        int DecNum = 0;
        boolean isHexStr = false;
        for ( int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.toUpperCase().charAt(charIdx);
            int Index = digits.indexOf(inChar);
            if (inChar >= 'A' && inChar <= 'F') {
                isHexStr = true;
                DecNum = 16 * DecNum + Index;
            } else if (inChar >= '0' && inChar <= '9') {
                isHexStr = true;
                DecNum = 16 * DecNum + Index;
            } else {
                isHexStr = false;
                break;
            }
        }
        if (isHexStr) {
            System.out.println("The equivalent decimal number " + inStr + " is: " + DecNum);
        } else {
            System.out.println("error: invalid hexadecimal string: " + inStr);
        }
    }
}
