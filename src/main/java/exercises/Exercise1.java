package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void divideUserInputs(){
        int[] userInputs;
        while (true) {
            try {
                userInputs = getUserInputs();
                System.out.println(divide(userInputs[0], userInputs[1]));
            } catch (InputMismatchException e) {
                System.out.println("Please try again.");
            }
        }
    }

    private static int[] getUserInputs() {
        int[] array = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter divisor:");
        array[0] = scanner.nextInt();
        System.out.println("Enter dividend:");
        array[1] = scanner.nextInt();

        return array;
    }
}
