package CodeSchool;

import java.util.Scanner;

public class Calculator {


    public void run() {

        Scanner sc = new Scanner(System.in);

        double answer;

        System.out.print("First Number: ");
        String sFirstNumber = sc.next();
        c(sFirstNumber);

        System.out.print("Operator: ");
        String operator = sc.next();
        c(operator);

        if (operator.equals("sqrt")) {
            answer = sqrt1(sFirstNumber);
            System.out.println("Answer = " + answer + "\n");
            run();
        }

        System.out.print("Second Number: ");
        String sSecondNumber = sc.next();
        c(sSecondNumber);


        double firstNumber = Double.parseDouble(sFirstNumber);
        double secondNumber = Double.parseDouble(sSecondNumber);

        answer = operators(firstNumber, secondNumber, operator);

        System.out.println("Answer = " + answer + "\n");
        run();
    }


    // C Method Reset Calculator
    private void c(String phrase) {
        if (phrase.contains("c")) {
            System.out.println();
            run();
        }
    }


    //Sqrt method
    private double sqrt1(String sFirstNumber) {
        int firstNumber = Integer.parseInt(sFirstNumber);
        switch (firstNumber) {
            case 0:
                return 0;

            case 1:
                return 1;

            default:
                for (int i = 2; i <= firstNumber / 2; i++) {
                    if (i * i == firstNumber) {
                        return i;
                    } else if ((i + 1) * (i + 1) > firstNumber) {
                        System.out.println("This number has no roots");
                        break;
                    }
                }

                return -1;
        }
    }


    //Operators Method
    private double operators(double number1, double number2, String operator) {

        switch (operator) {
            case "+":
                return number1 + number2;

            case "-":
                return number1 - number2;

            case "*":
                return number1 * number2;

            case "/":
                if (number2 != 0) {
                    return number1 / number2;
                }
                System.out.println("SecondNumber = 0(Error)");
                return 0;

            default:
                System.out.println("Input operator +,-,*,/" + "\n");
                return 0;
        }
    }

}