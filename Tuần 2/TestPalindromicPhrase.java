import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the phrase: ");
        String inStr = scanner.nextLine();

        scanner.close();

        //loop and print
        int inStrLen = inStr.length();
        int fIdx = 0;
        int bIdx = inStrLen - 1;
        boolean isPalindrome = false;
        
        while (fIdx < bIdx) {
            char bChar = inStr.toLowerCase().charAt(bIdx);
            char fChar = inStr.toLowerCase().charAt(fIdx);
            if (Character.isLetter(bChar) && Character.isLetter(fChar)) {
                if (bChar == fChar) {
                    ++fIdx;
                    --bIdx;
                    isPalindrome = true;
                } else {
                    System.out.println(inStr + " is not a palindrome");
                    break;            
                }
            } else {
                ++fIdx;
                --bIdx;
            }    
        }
        if (isPalindrome) {
            System.out.println(inStr + " is a palindrome");
        }
    }
}
