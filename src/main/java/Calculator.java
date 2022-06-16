import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        System.out.println("Witam w kalkulatorze!");
        Scanner scanner = new Scanner(System.in);
        boolean runApp = true;

        do {
            calculator(scanner);
            System.out.println(" Czy chcesz kontyunować?");
            System.out.println("1. Tak");
            System.out.println("2. Nie");
            int yesOrNo = scanner.nextInt();
            runApp = yesOrNo == 1;
        } while (runApp);


    }

    private static void calculator(Scanner scanner) {
        MathOperation mathOperation = new MathOperation();

        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("1. Dodawanie ");
        System.out.println("2. Odejmowanie ");
        System.out.println("3. Mnożenie ");
        System.out.println("4. Dzielenie ");
        int option = scanner.nextInt();

        System.out.println("Wprowadź pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Wynik dodawania to:" + firstNumber + " i " + secondNumber + " to " + mathOperation.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("Wynik odejmowania to:" + firstNumber + secondNumber + mathOperation.substract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("Wynik mnożenia to: " + firstNumber + secondNumber + mathOperation.multiply(firstNumber, secondNumber));
                break;

            case 4:
                System.out.println("Wynik dzielenia to: " + firstNumber + secondNumber + mathOperation.divide(firstNumber, secondNumber));
                break;
        }

    }

}
