package lesson_02;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    private double num1;
    private double num2;
    private char sign;
    private boolean isOn = true;

    public void run() {
        while (isOn) {
            System.out.print("Введите первое число: ");
            num1 = scanner.nextInt();
            System.out.print("Введите знак мат. операции: ");
            sign = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            num2 = scanner.nextInt();
            scanner.nextLine();

            switch (sign) {
                case '+':
                    System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 + num2);
                    break;
                case '-':
                    System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 - num2);
                    break;
                case '*':
                    System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 * num2);
                    break;
                case '/':
                    System.out.printf("%.0f %c %.0f = %.2f", num1, sign, num2, num1 / num2);
                    break;
                case '^':
                    double res = num1;
                    for (int i = 1; i < num2; i++) {
                        res *= num1;
                    }
                    System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, res);
                    break;
                case '%':
                    System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 % num2);
                    break;
                default:
                    System.out.println("Введите правильный символ");
                    break;
            }

            while (true) {
                System.out.println("\nХотите продолжить? [y/n]");
                String answer = scanner.nextLine();
                if (answer.equals("n")) {
                    isOn = false;
                    break;
                } else if (answer.equals("y")) {
                    break;
                }
            }

        }
    }


}
