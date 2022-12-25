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
  }
}
