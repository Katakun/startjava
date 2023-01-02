package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

  public static void main(String[] args) {

    Wolf wolf1 = new Wolf(true, "Seriy", 25, 7, "grey");
    wolf1.walk();
    wolf1.seat();
    wolf1.howl();
    wolf1.hount();

    wolf1.setAge(9);
    System.out.println(wolf1.getAge());
  }

}
