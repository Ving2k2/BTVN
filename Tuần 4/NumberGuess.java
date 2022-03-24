import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRT_NUMBER = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Java NumberGuess");
        System.out.println("Key in your guess: ");

        boolean guessTrue = false;
        int count = 1;
        do {
            int guessNum = scanner.nextInt();
            if (guessNum == SECRT_NUMBER) {
                System.out.println("You got it in " + count);
                guessTrue = true;
            } else if (guessNum > SECRT_NUMBER) {
                System.out.println("Try lower");
                count++;
            } else {
                System.out.println("Try higher");
                count++;
            }
        } while (!guessTrue);

        scanner.close();
    }
}
