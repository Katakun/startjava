package com.startjava.lesson_2_3_4.bookcase;

public class Book {

    private String author;
    private String tittle;
    private int year;

    public String getTittle() {
        return tittle;
    }

    public int getInfoLength() {
        return author.length() + tittle.length() + String.valueOf(year).length() + 4;
    }

    public Book(String author, String tittle, int publishYear) {
        this.author = author;
        this.tittle = tittle;
        this.year = publishYear;
    }

    @Override
    public String toString() {
        return author + ", " + tittle + ", " + year;
    }
}
