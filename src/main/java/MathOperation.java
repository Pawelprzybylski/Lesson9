public class MathOperation implements  MathOperations{


    @Override
    public  double add(double firstNumber, double secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public double substract(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }
}
