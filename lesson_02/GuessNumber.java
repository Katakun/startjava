package lesson_02;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int player1num;
        int player2num;


        do {
            boolean isWinner = false;
            int secretNumber = (int) (Math.random() * 101);

            do {
                player1num = player1.guessNumber();
                if (isGuess(player1num, secretNumber)) {
                    break;
                }
                player2num = player2.guessNumber();
                if (isGuess(player2num, secretNumber)) {
                    break;
                }
            } while (true);

            System.out.println("Хотите продолжить игру? [yes/no]");
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                continue;
            } else if (answer.equals("no")) {
                break;
            }
        } while (true);
    }


    public boolean isGuess(int number, int secretNumber) {
        if (number > secretNumber) {
            System.out.printf("%d больше загаданного%n", number);
        } else if (number < secretNumber) {
            System.out.printf("%d меньше загаданного%n", number);
        } else {
            System.out.println("Вы угадали!");
        }
        return number == secretNumber;
    }


}