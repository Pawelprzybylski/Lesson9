import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    private Map<String, MathOperations> operations = new HashMap<>();

    public void addOperation(String key, MathOperations mathOperations) {
        this.operations.put(key, mathOperations);
    }

    public static void main(String[] args) {
        System.out.println("Witam w kalkulatorze!");
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;

        do {
           Calculator calculator=new Calculator();
           calculator.addOperation("+",new Addition());
           calculator.addOperation("-",new Substraction());
           calculator.addOperation("*",new Multiplication());
           calculator.addOperation("/",new Division());

            System.out.println(" Czy chcesz kontynuować?");
            System.out.println("1. Tak");
            System.out.println("2. Nie");
            int yesOrNo = scanner.nextInt();
            runApp = yesOrNo == 1;

        } while (runApp);
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("+. Dodawanie ");
        System.out.println("-. Odejmowanie ");
        System.out.println("*. Mnożenie ");
        System.out.println("/. Dzielenie ");
        String option = scanner.nextLine();

        System.out.println("Wprowadź pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");
        int secondNumber = scanner.nextInt();

    }

    private void calculate(String option, int firstNumber, int secondNumber) {
        for (String key : this.operations.keySet()) {
            if (key.equals(option)) {
                this.operations.get(key).calculate(firstNumber, secondNumber);
            }
        }
    }

}
