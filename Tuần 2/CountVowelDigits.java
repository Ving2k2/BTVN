import java.util.Scanner;

public class CountVowelDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String inStr = scanner.next().toLowerCase();

        scanner.close();

        //loop
        int CountOfDigit = 0;
        int CountOfVowel = 0;
        int inStrLen = inStr.length();
        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            if (Character.isDigit(inStr.charAt(charIdx))) {
                CountOfDigit++;
            } else if (inStr.charAt(charIdx) == 'a' || inStr.charAt(charIdx) == 'o' || 
                       inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'i') {
                           CountOfVowel++;
                       }
        }
        //computing and print
        double PerOfVowel = (double) CountOfVowel / inStrLen * 100;
        System.out.printf("Number of vowels : %d (%.2f%%)%n",CountOfVowel,PerOfVowel);

        double PerOfDigit = (double)  CountOfDigit / inStrLen * 100;
        System.out.printf("Number of digits : %d (%.2f%%)%n",CountOfDigit,PerOfDigit);

    }
}
