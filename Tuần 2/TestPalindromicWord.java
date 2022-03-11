import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String inStr = scanner.next();

        scanner.close();

        //loop and print
        int inStrLen = inStr.length();
        int fIdx = 0;
        int bIdx = inStrLen - 1;
        while (fIdx < bIdx) {
            char bChar = inStr.toLowerCase().charAt(bIdx);
            char fChar = inStr.toLowerCase().charAt(fIdx);
            if (bChar == fChar) {
                ++fIdx;
                --bIdx;
            } else {
                System.out.println(inStr + " is not a palindrome");
                break;            
            }
        }
        if (fIdx == bIdx) {
            System.out.println(inStr + " is a palindrome");
        }
    }
}
