import java.util.Scanner;

public class RadixN2Dec {
    public static void Bin2Dec(String inString) {
        int inNum = Integer.parseInt(inString);
        int decNum = 0;
        int lastNum;
        int base = 1;
        boolean isBinary = false;
        
        while (inNum > 0) {
            lastNum = inNum % 10;
            if (lastNum == 1 || lastNum == 0) {
                decNum += lastNum * base;
                base *= 2;
                isBinary = true;
            } else {
                System.out.println("error: invalid binary string " + inNum);
                isBinary =false;
                break;
            }
            inNum = inNum / 10;
        }
        
        if (isBinary) {
            System.out.println("The equivalent decimal number " + inNum + " is: " + decNum);
        }
    }

    public static void Hex2Dec(String inString) {
        String digits = "0123456789ABCDEF";  
        int inStrLen = inString.length();
        boolean isHexStr = false;
        int decNum = 0; 
        
        for ( int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inString.toUpperCase().charAt(charIdx);
            int index = digits.indexOf(inChar);

            if (inChar >= 'A' && inChar <= 'F') {
                isHexStr = true;
                decNum = 16 * decNum + index;
            } else if (inChar >= '0' && inChar <= '9') {
                isHexStr = true;
                decNum = 16 * decNum + index;
            } else {
                isHexStr = false;
                break;
            }
        }
        
        if (isHexStr) {
            System.out.println("The equivalent decimal number " + inString + " is: " + decNum);
        } else {
            System.out.println("error: invalid hexadecimal string: " + inString);
        }
    }

    public static void Oct2Dec(String inString) {
        int inNum = Integer.parseInt(inString);
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radix: ");
        int inRadix = scanner.nextInt();

        System.out.print("Enter the String: ");
        String inStr = scanner.next();

        scanner.close();

        //if-else
        if (inRadix == 10) {
            Bin2Dec(inStr);
        } else if (inRadix == 8) {
            Oct2Dec(inStr);
        } else if (inRadix == 16) {
            Hex2Dec(inStr);
        } else {
            System.out.println("error: invalid radix input...");
        }
    }
}
