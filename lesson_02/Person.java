package lesson_02;

public class Person {

  private String sex;
  private String name;
  private double weight;
  private int age;

  public Person(String sex, String name, double weight, int age) {
    this.sex = sex;
    this.name = name;
    this.weight = weight;
    this.age = age;
  }

  public void walk() {
    System.out.printf("Human %s walk", name);
  }

}
