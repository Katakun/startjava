package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        // Обнуляем счетчики и массивы попыток
        player1.resetCountNums();
        player2.resetCountNums();

        // Загадывается секретное число
        secretNumber = (int) (Math.random() * 101);
        System.out.printf("secret number = %d%n", secretNumber);
        System.out.println("У каждого игрока по 10 попыток");

        while (player1.getCountGuess() < 10 && player2.getCountGuess() < 10) {
            // Попытка первого игрока угадать число
            if (isGuess(player1)) {
                break;
            }
            // Попытка второго игрока угадать число
            if (isGuess(player2)) {
                break;
            }
        }
        player1.printGuessNumber();
        player2.printGuessNumber();

    }
    private boolean isGuess(Player player) {
        int playerGuessNumber = player.guessNumber();

        if (playerGuessNumber > secretNumber) {
            System.out.printf("Число %d больше загаданного%n", playerGuessNumber);
        } else if (playerGuessNumber < secretNumber) {
            System.out.printf("Число %d меньше загаданного%n", playerGuessNumber);
        } else {
            System.out.printf("Игрок %s угадал число %d с %d попытки%n",
                    player.getName(), secretNumber, player.getCountGuess());
        }
        return playerGuessNumber == secretNumber;
    }


}