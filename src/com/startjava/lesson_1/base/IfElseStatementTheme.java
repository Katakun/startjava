package com.startjava.lesson_1.base;

// import java.util.Random;

class IfElseSTatement {
  public static void main(String[] args) {

    System.out.println("1. Перевод псевдокода на язык Java");
    int age = 25;
    boolean isMale = true;
    double height = 1.85;
    String name = "Mickael";
    // Random random = new Random();

    if (age > 20) {
      System.out.printf("Возраст больше %d%n", age);
    } else {
      System.out.printf("Возрат меньше либо равен %d%n", age);
    }

    if (isMale) {
      System.out.println("Это мужчина");
    } else {
      System.out.println("Это женщина");
    }

    if (height < 1.80) {
      System.out.printf("Рост выше %.2f%n", height);
    } else {
      System.out.printf("Рост ниже либо равен %.2f%n", height);
    }

    char firstLetterName = name.charAt(0);
    if (firstLetterName == 'M') {
      System.out.println("Первая буква М");
    } else if (firstLetterName == 'I') {
      System.out.println("Первая буквы I");
    } else {
      System.out.println("Первая буква не M  и не I");
    }

    System.out.println("\n2. Поиск max и min числа");
    int num1 = 7;
    int num2 = 7;
    if (num1 > num2) {
      System.out.printf("Число %d больше числа %d%n", num1, num2);
    } else if (num2 > num1) {
      System.out.printf("Число %d больше числа %d%n", num2, num1);
    } else {
      System.out.printf("Числа %d и %d равны%n", num1, num2);
    }

    System.out.println("\n3. Проверка числа");
    int number = (int) (Math.random() * 11);
    if (number == 0) {
      System.out.printf("Число %d является 0%n", number);
    } else if (number % 2 == 0) {
      System.out.printf("Число %d четное%n", number);
    } else if (number % 2 != 0) {
      System.out.printf("Число %d нечетное", number);
    }
    if (number < 0) {
      System.out.printf("Число %d отрицательное", number);
    }

    System.out.println("\n4. Поиск одинаковых цифр в числах");
    int num3digit1 = 333; // random.nextInt(100, 1000);
    int num3digit2 = 333; // random.nextInt(100, 1000);
    System.out.println("Числа " + num3digit1 + " и " + num3digit2);
    if (num3digit1 % 10 == num3digit2 % 10) {
      System.out.printf("Последние числа %d и %d равны%n", num3digit1, num3digit2);
    }
    if (num3digit1 / 10 % 10 == num3digit2 / 10 % 10) {
      System.out.printf("Десятки чисел %d и %d равны%n", num3digit1, num3digit2);
    }
    if (num3digit1 / 100 == num3digit2 / 100) {
      System.out.printf("Сотни чисел %d и %d равны%n", num3digit1, num3digit2);
    }

    System.out.println("\n5. Определение символа по его коду");
    char symbol = '\u0028';

    if (symbol >= 'a' && symbol <= 'z') {
      System.out.printf("%c маленькая буква%n", symbol);
    } else if (symbol >= 'A' && symbol <= 'Z') {
      System.out.printf("%c большая буква%n", symbol);
    } else if (symbol >= '0' && symbol <= '9') {
      System.out.printf("%c число%n", symbol);
    } else {
      System.out.printf("%c не буква и не число%n", symbol);
    }

    System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
    double deposit = 300_000;
    double income = 0;
    int percent = 0;
    double depositWithInterest;
    if (deposit < 100_000) {
      percent = 5;
    } else if (deposit >= 100_000 && deposit < 300_000) {
      percent = 7;
    } else if (deposit >= 300_000) {
      percent = 10;
    }
    income = deposit / 100 * percent;
    depositWithInterest = deposit + income;
    System.out.printf(
        "На вкалад в сумме %.2f был начислено %d процентов что составило %.2f рублей, итого на счету %.2f рублей.%n",
        deposit, percent, income, depositWithInterest);

    System.out.println("\n7. Определение оценки по предметам");
    int historyPercent = 61;
    int programmPercent = 91;
    int ballHistory = 0;
    int ballProgramm = 0;

    if (historyPercent <= 60) {
      ballHistory = 2;
    }
    if (historyPercent > 60) {
      ballHistory = 3;
    }
    if (historyPercent > 73) {
      ballHistory = 4;
    }
    if (historyPercent > 91) {
      ballHistory = 5;
    }

    if (programmPercent <= 60) {
      ballProgramm = 2;
    }
    if (programmPercent > 60) {
      ballProgramm = 3;
    }
    if (programmPercent > 73) {
      ballProgramm = 4;
    }
    if (programmPercent > 91) {
      ballProgramm = 5;
    }

    double averageBall = ((double) ballHistory + ballProgramm) / 2;
    int averagePercent = (historyPercent + programmPercent) / 2;
    System.out.printf("%d оценка по истории%n", ballHistory);
    System.out.printf("%d оценка по программированию%n", ballProgramm);
    System.out.printf("%.1f средний балл по предметам%n", averageBall);
    System.out.printf("%d средний процент по предметам%n", averagePercent);

    System.out.println("\n8. Расчет прибыли за год");
    int rentPerMonth = 5_000;
    int incomePerMonth = 13_000;
    int costPerMonth = 9_000;
    int profitPerMonth = incomePerMonth - costPerMonth - rentPerMonth;
    int profitPerYear = profitPerMonth * 12;

    String sign = profitPerYear < 0 ? "" : "+";
    System.out.printf("Прибыль за год: %s%d руб.%n", sign, profitPerYear);

    System.out.println("\n9. Подсчет количества банкнот");
    int needSum = 342;
    int hundredDollarAmount = 10;
    int tenDollarAmount = 5;
    int oneDollarAmount = 50;

    int hundredToPerson = 0;
    int tenToPerson = 0;
    int oneToPerson = 0;

    System.out.printf("Нужно выдать сумму $%d%n", needSum);
    if (needSum / 100 < hundredDollarAmount) {
      hundredToPerson = needSum / 100;
      needSum = needSum % 100;
    } else if (needSum / 10 > hundredDollarAmount) {
      hundredToPerson = hundredDollarAmount;
      needSum = needSum - (hundredDollarAmount * 100);
    }

    if (needSum / 10 < tenDollarAmount) {
      tenToPerson = needSum / 10;
      needSum = needSum % 10;
    } else if (needSum / 10 > tenDollarAmount) {
      tenToPerson = tenDollarAmount;
      needSum = needSum - (tenDollarAmount * 10);
    }

    if (needSum < oneDollarAmount) {
      oneToPerson = needSum;
      needSum = 0;
    } else if (needSum > oneDollarAmount) {
      System.out.println("В банкомате не хватает денег");
    }

    System.out.printf("$100 купюр %d штук в сумме $%d%n", hundredToPerson, hundredToPerson * 100);
    System.out.printf("$10 купюр %d штук в сумме $%d%n", tenToPerson, tenToPerson * 10);
    System.out.printf("$1 купюр %d штук в сумме $%d%n", oneToPerson, oneToPerson);
    int sumToPerson = hundredToPerson * 100 + tenToPerson * 10 + oneToPerson;
    System.out.printf("Выдананая сумма = $%d%n", sumToPerson);
  }
}