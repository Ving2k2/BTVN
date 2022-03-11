import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex String: ");
        String inStr = scanner.next();

        scanner.close();

        //loop and print
        int inStrLen = inStr.length();
        boolean isHexStr = false;
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.toLowerCase().charAt(charIdx);
            if (inChar >= 'a' && inChar <= 'f') {
                isHexStr = true;
            } else if (inChar >= '0' && inChar <= '9') {
                isHexStr = true;
            } else {
                isHexStr = false;
            }
        }
        if (isHexStr) {
            System.out.println(inStr + " is a hex string");
        } else {
            System.out.println(inStr + " is not a hex string");
        }
    }
}
