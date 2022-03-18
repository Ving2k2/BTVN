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
        int decNum = 0;
        boolean isHexStr = false;
        
        for ( int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.toUpperCase().charAt(charIdx);
            int Index = digits.indexOf(inChar);
            if (inChar >= 'A' && inChar <= 'F') {
                isHexStr = true;
                decNum = 16 * decNum + Index;
            } else if (inChar >= '0' && inChar <= '9') {
                isHexStr = true;
                decNum = 16 * decNum + Index;
            } else {
                isHexStr = false;
                break;
            }
        }
        if (isHexStr) {
            System.out.println("The equivalent decimal number " + inStr + " is: " + decNum);
        } else {
            System.out.println("error: invalid hexadecimal string: " + inStr);
        }
    }
}
