package com.startjava.lesson_1.base;

public class CyclesTheme {

  public static void main(String[] args) {

    /*
     * Подсчет суммы четных и нечетных чисел
     * подсчитайте с помощью do-while сумму четных и нечетных чисел в отрезке [-10,
     * 21]
     * отобразите эти значения в формате:
     * в промежутке [-10, 21] сумма четных чисел = X, а нечетных = Y
     */

    System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
    int start = -10;
    int stop = 21;
    int evenCount = 0;
    int oddCount = 0;
    int tmp = start;
    do {
      if (tmp % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
      tmp++;
    } while (tmp <= stop);
    System.out.printf("В промежутке [%d, %d] сумма четных чисел = %d, а нечетных = %d%n", start, stop, evenCount,
        oddCount);

    /*
     * Вывод чисел в интервале (min и max) в порядке убывания
     * даны значения 10, 5, -1 найдите среди них max и min число
     * отобразите в консоль в одну строку, с помощью for, все числа в интервале
     * (min, max) в порядке убывания
     * обратите внимание, что интервал — математический (не путайте его с отрезком)
     * использовать методы max и min класса Math — нельзя
     */
    System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
    int num1 = 10;
    int num2 = 5;
    int num3 = -1;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    if (num1 > num2 && num1 > num3) {
      max = num1;
    } else if (num2 > num1 && num2 > num3) {
      max = num2;
    } else {
      max = num3;
    }

    if (num1 < num2 && num1 < num3) {
      min = num1;
    } else if (num2 < num1 && num2 < num3) {
      min = num2;
    } else {
      min = num3;
    }

    System.out.printf("Min = %d, Max = %d%n", min, max);
    for (int i = max - 1; i > min; i--) {
      System.out.print(i + " ");
    }
    System.out.println();

    /*
     * Вывод реверсивного числа и суммы его цифр
     * дано число 1234 в цикле while выделите каждую его цифру
     * подсчитайте сумму полученных цифр отобразите в консоли:
     * исходное число в обратном порядке
     * сумму его цифр
     */
    System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
    int number = 1234;
    int sum = 0;
    int reminder = 0;

    while (number > 0) {
      reminder = number % 10;
      sum += reminder;
      number /= 10;
      System.out.print(reminder);
    }
    System.out.printf("%nСумма чисел равна %d%n", sum);

    /*
     * Вывод чисел на консоль в несколько строк
     * выведите с помощью for на консоль числа в полуинтервале [1, 24)
     * шаг итерации 2
     * отображайте в каждой строке по 5 чисел
     * отделяйте их друг от друга необходимым количеством пробелов
     * не указывайте впереди числа нули
     * выравнивайте числа в каждом столбце по правому краю, используя
     * форматированный (1, 2) вывод с помощью printf
     * недостающее в последней строке до 5 количество чисел заполните нулями
     * число нулей определяйте программно. Не считайте их в уме и не пишите сами
     */
    System.out.println("\n4. Вывод чисел на консоль в несколько строк");
    start = 1;
    stop = 24;
    int count5 = 0;
    int addForStop = stop % 10 == 0 ? 0 : 10 - (stop % 10);
    int printNum = 0;
    ;
    for (int i = start; i < stop + addForStop; i += 2) {
      printNum = i;
      if (i > stop) {
        printNum = 0;
      }
      System.out.printf("%4d", printNum);

      count5++;
      if (count5 % 5 == 0) {
        System.out.println();
      }
    }

    /*
     * Проверка количества двоек на четность/нечетность
     * дано число 3242592
     * подсчитайте в цикле while количество 2, а затем проверьте получившееся
     * значение на четность/нечетность
     * отобразите результат:
     * число X содержит N (четное/нечетное) количество двоек
     * 
     */
    System.out.println("\n5. Проверка количества двоек на четность/нечетность");
    number = 3242592;
    int count2 = 0;
    tmp = number;

    while (tmp > 0) {
      int n = tmp % 10;
      if (n == 2) {
        count2++;
      }
      tmp /= 10;
    }
    String oddOrEven = count2 % 2 == 0 ? "четное" : "нечетное";
    System.out.printf("число %d содержит %d %s количество двоек%n", number, count2, oddOrEven);

    /*
     * Отображение фигур в консоли
     * отобразите геометрические фигуры, используя:
     * для прямоугольника только for
     * для прямоугольного треугольника только while
     * для второго треугольника только do-while
     * каждую фигуру выводите на новой строке
     * 
     ********** ##### $
     ********** #### $$
     ********** ### $$$
     ********** ## $$
     ********** # $
     */

    System.out.println("\n6. Отображение фигур в консоли\n");

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    int i = 5;
    int j = 5;
    while (i > 0) {
      while (j > 0) {
        System.out.print("#");
        j--;
      }
      System.out.println();

      i--;
      j = i;
    }
    System.out.println();

    i = 5;
    j = 0;
    int jcount = 1;
    boolean toggle = false;
    do {

      do {
        System.out.print("$");
        j++;
      } while (j < jcount);
      System.out.println();
      j = 0;

      if (jcount == 3) {
        toggle = true;
      }
      if (toggle) {
        jcount--;
      } else {
        jcount++;
      }
      i--;
    } while (i > 0);

    /*
     * Отображение ASCII-символов
     * • отобразите, используя for, данные столбцов Dec и Char (и названия столбцов)
     * • из таблицы
     * • выведите на консоль:
     * - символы, идущие до цифр и имеющие нечетные коды
     * - маленькие английские буквы, имеющие четные коды
     * • данные каждого столбца должны быть выровнены по правому краю
     * 
     */
    System.out.println("\n7. Отображение ASCII-символов");
    System.out.println(" dec | char");
    for (int k = 0; k <= 122; k++) {
      if (k < 48 && k % 2 == 0) {
        System.out.printf("%4d | %1c%n", k, k);
      }
      if (k >= 97 && k <= 122 && k % 2 != 0) {
        System.out.printf("%4d | %1c%n", k, k);
      }
    }

    /*
     * Проверка, является ли число палиндромом
     * • дано число 1234321
     * • проверьте, является ли оно палиндромом (читается одинаково с любой стороны)
     * • использовать Math.pow нельзя
     * • отобразите в консоли:
     * -- число X является палиндромом
     */
    System.out.println("\n8. Проверка, является ли число палиндромом");
    number = 12321;
    int reverseNumber = 0;
    tmp = number;
    while (tmp > 0) {
      reverseNumber *= 10;
      reverseNumber = reverseNumber + tmp % 10;
      tmp /= 10;
    }
    String no = number == reverseNumber ? "является" : "не является";
    System.out.println(reverseNumber);
    System.out.printf("Число %d %s палиндромом%n", number, no);

    /*
     * Определение, является ли число счастливым
     * • счастливым называется число, сумма первых трех цифр которого
     * равна сумме последних
     * • возьмите любое шестизначное число
     * • подсчитайте сумму каждой его половины
     * • отобразите в консоли:
     * -- каждую тройку цифр в формате “Сумма цифр abc = sum”
     * -- является число счастливым или нет
     * 
     */
    System.out.println("\n9. Определение, является ли число счастливым");
    number = 523145;
    int sumLast = 0;
    int sumFirst = 0;
    int count = 0;
    tmp = number;

    while (tmp > 0) {
      if (count < 3) {
        sumLast += tmp % 10;
      } else {
        sumFirst += tmp % 10;
      }
      tmp /= 10;
      count++;
    }
    String word = sumFirst == sumLast ? "" : "не";
    System.out.printf("Сумма цифр %d = %d%n", number / 1000, sumFirst);
    System.out.printf("Сумма цифр %d = %d%n", number % 1000, sumLast);
    System.out.printf("%d %s является счастливым%n", number, word);

    /*
     * Вывод таблицы умножения Пифагора
     * • отобразите таблицу умножения в точности, как в образце, включая
     * горизонтальные и вертикальные линии
     * • не добавляйте между строками и столбцами лишние пустоты
     * • используйте цикл for
     */
    System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

    for (int row = 1; row < 10; row++) {
      for (int col = 1; col < 10; col++) {
        System.out.printf("%3d", row * col);
        if (col == 1) {
          System.out.print(" |");
        }
      }
      System.out.println();
      if (row == 1) {
        System.out.println("-----------------------------");
      }
    }
  }
}
