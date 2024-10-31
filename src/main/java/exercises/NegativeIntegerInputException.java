package exercises;

public class NegativeIntegerInputException extends Exception {
    public NegativeIntegerInputException(String s) {
        super(s);
               /* if (userInputs[0] < 0 || userInputs[1] < 0){
                    ArrayList<Integer> negatives = new ArrayList<>();
                    for (int i = 0; i < userInputs.length; i++){
                        if (userInputs[i] < 0){
                            negatives.add(userInputs[i]);
                        }
                    }*/
    }
}
