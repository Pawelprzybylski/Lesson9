import java.util.HashMap;
import java.util.Map;


public class Calculator {

    private Map<Character, MathOperation> operations = new HashMap<>();

    public void addOperation(char key, MathOperation mathOperations) {
        this.operations.put(key, mathOperations);
    }



    public void calculate(String option, int firstNumber, int secondNumber) {
        for (Character key : this.operations.keySet()) {
            if (key.equals(option)) {
                this.operations.get(key).calculate(firstNumber, secondNumber);
            }
        }

    }

}
