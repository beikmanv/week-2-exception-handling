package exercises;

import java.util.ArrayList;

public class NegativeIntegerInputException extends RuntimeException {
    public NegativeIntegerInputException(int[] numbers) {
        super(generateMessage(numbers));
    }
    private static String generateMessage(int[] numbers){
        ArrayList<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                negatives.add(numbers[i]);
            }
        }
        return "The following negative integer(s) are not allowed in this operation: " + negatives.toString();
    }
}
