public class Calculator {
  public static void main(String[] args) {
    double num1 = 3;
    double num2 = 2;
    char sign = '%';

    if (sign == '+') {
      System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 + num2);
    } else if (sign == '-') {
      System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 - num2);
    } else if (sign == '*') {
      System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 * num2);
    } else if (sign == '/') {
      System.out.printf("%.0f %c %.0f = %.2f", num1, sign, num2, num1 / num2);
    } else if (sign == '^') {
      Double res = num1;
      for (int i = 1; i < num2; i++) {
        res *= num1;
      }
      System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, res);
    } else if (sign == '%') {
      System.out.printf("%.0f %c %.0f = %.0f", num1, sign, num2, num1 % num2);
    }
  }
}
