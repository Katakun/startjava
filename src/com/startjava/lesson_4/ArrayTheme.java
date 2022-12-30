package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {

//        System.out.println("\n1. Реверс значений массива");
//        int[] arr1 = {1, 3, 5, 7, 2, 4, 6};
//        System.out.println(Arrays.toString(arr1));
//        int[] tmp = Arrays.copyOf(arr1, arr1.length);
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = tmp[arr1.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(arr1));
//
//        System.out.println("\n2. Вывод произведения элементов массива");
//        int[] arr2 = new int[10];
//        int mult = 1;
//        for (int i = 0; i < 10; i++) {
//            arr2[i] = i;
//        }
//        for (int i = 1; i < 9; i++) {
//            mult *= i;
//            System.out.printf("%d", i);
//            if (i < 8) {
//                System.out.printf(" * ");
//            }
//        }
//        System.out.println(" = " + mult);
//
//        System.out.println("\n3. Удаление элементов массива");
//        double[] arr3 = new double[15];
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = Math.random();
////            System.out.printf("%d = %f%n",i, arr3[i]);
//        }
//        int index = arr3.length / 2;
////        System.out.println(arr3[index]);
//        double[] nulled = new double[arr3.length];
//        for (int i = 0; i < arr3.length; i++) {
//            nulled[i] = arr3[i] > arr3[index] ? 0 : arr3[i];
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.printf("%5.3f = %5.3f%n", arr3[i], nulled[i]);
//        }
//
//        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
//        char[] alphabet = new char[26];
//        for (int i = 0; i < alphabet.length; i++) {
//            alphabet[i] = (char) (65 + i);
////            System.out.println(alphabet[i]);
//        }
//        for (int i = 0; i < alphabet.length; i++) {
//            for (int j = alphabet.length - 1; j >= alphabet.length - 1 - i; j--) {
//                System.out.print(alphabet[j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n5. Генерация уникальных чисел");
//        int[] randArr = new int[5];
//        boolean isInArr = false;
//        for (int i = 0; i < randArr.length; i++) {
//            int randomInt = (int) (Math.random() * 6);
//            for (int num : randArr) {
//                if (randomInt == num) {
//                    isInArr = true;
//                    if (i != 0) {
//                        i--;
//                    } else {
//                        i = i;
//                    }
//                }
//            }
//            if (!isInArr) {
//                randArr[i] = randomInt;
//            }
//            isInArr = false;
//        }
//        System.out.print(Arrays.toString(randArr));


        System.out.println("\n6. Сдвиг элементов массива");

        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int copyLen = stringArr.length;
        for (String str : stringArr) {
            if (str.isBlank()) {
                copyLen--;
            }
        }
        String[] copyArr = new String[copyLen];

        int sourcetPos = 0;
        int desttPos = 0;
        int len = 0;
        boolean hasString = false;

        for (int i = 0; i < stringArr.length; i++) {
            while (!stringArr[i].isBlank()) {  // {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
                sourcetPos = i;
                len++;
                i++;
                hasString = true;
            }
            if (hasString) {
                sourcetPos = sourcetPos - len + 1;
                System.arraycopy(stringArr, sourcetPos, copyArr, desttPos, len);
                desttPos += len;
                hasString = false;
                len = 0;
            }
        }
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(copyArr));


//        int countCopy = 0;
//        for (int i = 0; i < stringArr.length; i++) {
//            if (!stringArr[i].isBlank()) {
//                copyArr[countCopy] = stringArr[i];
//                countCopy++;
//            }
//        }
    }
}
