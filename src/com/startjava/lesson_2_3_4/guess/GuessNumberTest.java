package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "y";

        System.out.print("Введите имя первого игрока: ");
        String namePlayer1 = scanner.nextLine();
        Player player1 = new Player(namePlayer1);

        System.out.print("Введите имя второго игрока: ");
        String namePlayer2 = scanner.nextLine();
        Player player2 = new Player(namePlayer2);

        GuessNumber game = new GuessNumber(player1, player2);
        while ("y".equals(userAnswer)) {
            game.startGame();
            do {
                System.out.println("Желаете повторить игру? [y/n]");
                userAnswer = scanner.nextLine();
            } while (!"y".equals(userAnswer) && !"n".equals(userAnswer));
        }


        scanner.close();
    }
}
