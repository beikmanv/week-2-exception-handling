package exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void divideUserInputs() {
        int[] userInputs;
        while (true) {
            try {
                userInputs = getUserInputs();
                if (userInputs[0] < 0 || userInputs[1] < 0){
                    throw new NegativeIntegerInputException(userInputs);
                }
                System.out.println(divide(userInputs[0], userInputs[1]));
            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
            }catch (ArithmeticException e){
                System.out.println("Cannot divide by zero. Please try again");
            }catch (NegativeIntegerInputException e){
                System.out.println(e.getMessage());;
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
        //scanner.close();
        return array;
    }
}
