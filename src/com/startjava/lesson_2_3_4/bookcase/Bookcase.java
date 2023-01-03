package com.startjava.lesson_2_3_4.bookcase;

import java.util.Arrays;
import java.util.Scanner;

public class Bookcase {

    private int bookAmount;
    private Book[] bookshelf = new Book[10];
    Scanner scanner = new Scanner(System.in);
    private int bookCount = 0;


    //    добавить книгу
    public void addBook() {
        System.out.println("Добавление книги на полку");
        System.out.print("author: ");
        String author = scanner.nextLine();
        System.out.print("title: ");
        String title = scanner.nextLine();
        System.out.print("year: ");
        int year = Integer.parseInt(scanner.nextLine());
        Book book = new Book(author, title, year);
        bookshelf[bookCount] = book;
        bookCount++;
        System.out.println("Книга: " + book + " добавлена на полку\n");
    }

    //    найти книгу
    public void findBook() {
        System.out.print("Введите название книги для поиска: ");
        String bookTitle = scanner.nextLine();
        boolean hasFind = false;
        for (Book book : bookshelf) {
            if (book != null && bookTitle.equalsIgnoreCase(book.getTittle())) {
                System.out.println("Найдена книга: " + book + "\n");
                hasFind = true;
            }
        }
        if (!hasFind) {
            System.out.printf("Книга с название \"%s\" не найдена%n", bookTitle);
        }
    }

    //    удалить книгу
    public void deleteBook() {
        System.out.print("Введите название книги для удаления: ");
        String bookTitle = scanner.nextLine();
        int deletIndex = -1;
        Book[] tmp = new Book[bookshelf.length];

        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i] != null && bookTitle.equalsIgnoreCase(bookshelf[i].getTittle())) {
                deletIndex = i;
                bookCount--;
            }
        }
        // копируем левую часть массива
        System.arraycopy(bookshelf, 0, tmp, 0, deletIndex);
        // копируем правую часть массива
        System.arraycopy(bookshelf, deletIndex + 1, tmp, deletIndex, bookCount - deletIndex);
        // копируем временный массив
        bookshelf = Arrays.copyOf(tmp, tmp.length);
    }

    //    получить все книги (только для визуализации шкафа)
    public void showBooks() {
        System.out.printf("%nВ шкафу %d книги и свободно %d полок%n%n",
                bookCount, bookshelf.length - bookCount);
        int shelfWidth = 50;

        if (bookshelf[0] != null) {
            for (int i = 0; i < bookCount; i++) {
                if (bookshelf[i].getInfoLength() > shelfWidth) {
                    shelfWidth = bookshelf[i].getInfoLength();
                }
            }
            for (int i = 0; i < bookCount; i++) {
                System.out.print("|" +  bookshelf[i]);
                System.out.print(" ".repeat(shelfWidth - bookshelf[i].getInfoLength()));
                System.out.println("|");
                System.out.println("|" + "-".repeat(shelfWidth ) + "|");
            }
        } else {
            System.out.println("|" + "-".repeat(shelfWidth ) + "|");
        }


    }

    //    получить количество книг в шкафу
    public int bookAmount() {
        return -1;
    }

    //    получить количество свободных полок
    public int amountFreeShelf() {
        return -1;
    }

    //    очистить полку
    public void clearShelf() {
        Arrays.fill(bookshelf, null);
        bookCount = 0;
    }

}
