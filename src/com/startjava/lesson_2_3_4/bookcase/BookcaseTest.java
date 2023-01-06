package com.startjava.lesson_2_3_4.bookcase;

import java.util.Scanner;

public class BookcaseTest {

    public static void main(String[] args) {
        Bookcase bc = new Bookcase();
        Scanner scanner = new Scanner(System.in);
        String[] menuItems = {"add book", "find book", "delete book", "clear", "quit"};
        Boolean isOn = true;


        while (isOn) {
            System.out.println();
            for (int i = 0; i < menuItems.length; i++) {
                System.out.printf("%d. %s%n", i + 1, menuItems[i]);
            }
            System.out.print("Ваш выбор: ");
            int userChoice = Integer.parseInt(scanner.nextLine());
            switch (userChoice) {
                case 1 -> bc.addBook();
                case 2 -> bc.findBook();
                case 3 -> bc.deleteBook();
                case 4 -> bc.clearShelf();
                case 5 -> isOn = false;
            }
            bc.showBooks();
        }
    }
}
