package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "y";
        while ("y".equals(answer)) {
            System.out.print("Введите математическое выражение: ");
            String userAnswer = scanner.nextLine();
            Double calcResult = Calculator.calculate(userAnswer);
            System.out.println(new DecimalFormat("#.#####").format(calcResult));

            do {
                System.out.println("Хотите продолжить? [y/n]");
                answer = scanner.nextLine();
            } while (!"y".equals(answer) && !"n".equals(answer));

        }
    }
}
