import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String inStr = scanner.next();

        scanner.close();

        //loop
        String newStr = "";
        int inStrLen = inStr.length();
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            newStr += inStr.charAt(charIdx);
        }
        System.out.println("The reverse of the String " + inStr + " is " + newStr);
    }
}
