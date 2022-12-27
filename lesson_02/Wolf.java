package lesson_02;

public class Wolf {
  private boolean isMale;
  private String name;
  private double weight;
  private int age;
  private String color;

  public boolean isMale() {
    return isMale;
  }

  public void setMale(boolean male) {
    isMale = male;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 8) {
      System.out.println("Некорректный возраст");
    } else {
      this.age = age;
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Wolf(boolean isMale, String name, double weight, int age, String color) {
    this.isMale = isMale;
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = color;

  }

  public void walk() {
    System.out.printf("wolf %s is walking%n", name);
  }

  public void seat() {
    System.out.printf("wolf %s is seating%n", name);
  }

  public void howl() {
    System.out.printf("wolf %s is howling%n", name);
  }

  public void hount() {
    System.out.printf("wolf %s is hounting%n", name);
  }
}
