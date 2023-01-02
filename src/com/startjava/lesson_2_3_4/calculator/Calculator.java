package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static long num1;
    private static long num2;
    private static char sign;

    public static double calculate(String input) {
        String[] words = input.split(" ");

        if (isOkNum(words[0]) && isOkNum(words[2])) {
            num1 = Integer.parseInt(words[0]);
            num2 = Integer.parseInt(words[2]);
        }
        sign = words[1].charAt(0);

        return switch (sign) {
            case '+' -> (double) Math.addExact(num1, num2);
            case '-' -> (double) Math.subtractExact(num1, num2);
            case '*' -> (double) Math.multiplyExact(num1, num2);
            case '/' -> (double) num1 / num2;
            case '^' -> Math.pow(num1, num2);
            case '%' -> (double) Math.floorMod(num1, num2);
            default -> -1;
        };
    }

    private static boolean isOkNum(String word) {
        try {
            int number = Integer.parseInt(word);
            return number >= 0;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
