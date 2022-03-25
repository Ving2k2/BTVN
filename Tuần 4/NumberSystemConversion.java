import java.util.Locale;
import java.util.Scanner;

public class NumberSystemConversion {
    public static String toRadix(String str, int inRadix, int outRadix) {
        str = str.toUpperCase();

        int numDec = 0;
        for (int i = 0; i < str.length(); ++i) {
            char inChar = str.charAt(i);
            if ('0' <= inChar && inChar <= '9') {
                numDec = inRadix * numDec + (inChar - 48);
            } else {
                numDec = inRadix * numDec + (inChar - 55);
            }
        }

        if (outRadix == 10) {
            return String.valueOf(numDec);
        } else {
            StringBuilder outStr = new StringBuilder();
            while (numDec > 0) {
                int tmp = numDec % outRadix;
                if (tmp <= 9) {
                    outStr.append(tmp);
                } else {
                    outStr.append((char) tmp + 55);
                }
                numDec /= outRadix;
            }
            return outStr.reverse().toString();
        }
    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter a number and radix: ");
        String inStr = scanner.next();

        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();

        System.out.print("Enter the output radix: ");
        int outRadix = scanner.nextInt();

        scanner.close();

        String outStr = toRadix(inStr,inRadix,outRadix);
        System.out.println(inStr + " in radix " + inRadix + " is " + outStr + " in radix " + outRadix);
    }
}
