package com.startjava.lesson_1.base;

class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Выввод значения переменных на консоль");

        byte core = 8;
        short ram = 16;
        int hdd = 2_000_000;
        long resolution = 1980;
        float diagonal = 15.4F;
        double weigth = 2.54D;
        char model = 'p';
        boolean isGame = true;

        System.out.printf("Количество ядер: %d%n", core);
        System.out.printf("Оперативная память: %d mb %n", ram);
        System.out.printf("Жесткий диск: %d gb %n", hdd);
        System.out.printf("Разрешение монитора: %d px %n", resolution);
        System.out.printf("Диагональ: %.1f inches %n", diagonal);
        System.out.printf("Вес: %.2f kg %n", weigth);
        System.out.printf("Модель: HP 1711%c%n", model);
        System.out.printf("Игровой: %b%n", isGame);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double diskountSum = (penPrice + bookPrice) / 100 * 11;
        double totalSum = penPrice + bookPrice - diskountSum;
        System.out.printf("Сумма скидки: $%.2f%n", diskountSum);
        System.out.printf("Общая стоимость товаров: $%.2f%n", totalSum);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("""
                   J    a  v     v  a
                   J   a a  v   v  a a
                J  J  aaaaa  V V  aaaaa
                 JJ  a     a  V  a     a """);

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647 + 1;
        long l = 9_223_372_036_854_775_807L + 1;

        System.out.printf("byte: %d%n", b);
        System.out.printf("short: %d%n", s);
        System.out.printf("int: %d%n", i);
        System.out.printf("long: %d%n", l);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.printf("c помощью третьей переменной:%nnum1 = %d, num2 = %d%n", num1, num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.printf("num1 = %d, num2 = %d%n", num1, num2);

        System.out.printf("c помощью арифметики:%nnum1 = %d, num2 = %d%n", num1, num2);
        num2 = num2 - num1; // 2 - 5 = -3
        num1 = num2 + num1; // -3 + 5 = 2
        num2 = num1 - num2; // 2 - -3 = 5
        System.out.printf("num1 = %d, num2 = %d%n", num1, num2);

        System.out.printf("c помощью битовой операции:%nnum1 = %d, num2 = %d%n", num1, num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.printf("num1 = %d, num2 = %d%n", num1, num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char char1 = '#'; // 35
        char char2 = '&'; // 38
        char char3 = '@'; // 64
        char char4 = '^'; // 94
        char char5 = '_'; // 95
        System.out.printf("%d = %c%n", 35, char1);
        System.out.printf("%d = %c%n", 38, char2);
        System.out.printf("%d = %c%n", 64, char3);
        System.out.printf("%d = %c%n", 94, char4);
        System.out.printf("%d = %c%n", 95, char5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char rigthSlah = '/';
        char leftSlah = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char underScore = '_';

        System.out.println("    " + rigthSlah + leftSlah);
        System.out.println("   " + rigthSlah + "  " + leftSlah);
        System.out.println("  " + rigthSlah + underScore + leftBracket +
                " " + rightBracket + leftSlah);
        System.out.println(" " + rigthSlah + "      " + leftSlah);
        System.out.println("" + rigthSlah + underScore + underScore + underScore +
                underScore + rigthSlah + leftSlah + underScore + underScore + leftSlah);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10;
        // 123 3 12 - 2 1 2 3
        int sumDigits = (number % 10) + (number / 10 % 10) + (number / 10 / 10);
        int multDigits = (number % 10) * (number / 10 % 10) * (number / 10 / 10);

        System.out.printf("Число %d содержит:%n", number);
        System.out.printf("%d сотен%n", hundreds);
        System.out.printf("%d десятков%n", tens);
        System.out.printf("%d единиц%n", number);
        System.out.printf("Сумма его цифр = %d%n", sumDigits);
        System.out.printf("Произведение его цифр = %d%n", multDigits);

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 666; // 86_399;

        int remainSeconds = totalSeconds % 60;
        int remainMinutes = totalSeconds / 60 % 60;
        int hours = totalSeconds / 60 / 60;

        System.out.printf("%02d:%02d:%02d", hours, remainMinutes, remainSeconds);

    }
}