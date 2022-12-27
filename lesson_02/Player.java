package lesson_02;

import java.util.Scanner;

public class Player {

    private String name;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }
    public int guessNumber() {
        System.out.printf("%s введите число: ", name);
        int guessNumber = scanner.nextInt();
        scanner.nextLine();
        return guessNumber;
    }
}
