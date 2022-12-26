import java.util.Scanner;

public class MyFirstGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int guessNum = 1 + (int) (Math.random() * 101);
    int userNum;
    System.out.printf("Загаданное число: %d%n", guessNum);

    do {
      System.out.print("Введите число: ");
      userNum = scanner.nextInt();
      if (userNum > guessNum) {
        System.out.printf("%d больше загаданного%n", userNum);
      } else if (userNum < guessNum) {
        System.out.printf("%d меньше загаданного%n", userNum);
      }
    } while (userNum != guessNum);

    System.out.printf("%d число угадано", userNum);
  }
}