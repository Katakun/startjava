package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private String name;
    private int[] userNums = new int[10];
    private int countGuess = 0;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountGuess() {
        return countGuess;
    }

    public void resetCountNums() {
        Arrays.fill(userNums, 0);
        countGuess = 0;
    }

    public void printGuessNumber() {
        int[] numsFreeOfNull = Arrays.copyOf(userNums, countGuess);
        System.out.printf("%s's numbers ", name);
        for (int num : numsFreeOfNull) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

    public int guessNumber() {
        int guessNumber = -1;
        if (countGuess < 10) {
            System.out.printf("%s введите число: ", name);
            guessNumber = scanner.nextInt();
            scanner.nextLine();
            userNums[countGuess] = guessNumber;
            countGuess++;
        } else {
            System.out.printf("У %s кончились попытки", name);
        }
        return guessNumber;
    }
}
