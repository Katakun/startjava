package com.startjava.lesson_1.base;

import java.nio.charset.Charset;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Write once, run anywhere");
        System.out.println("Однажды написано, работает везде");
        System.out.println(Charset.defaultCharset().displayName());
    }
}