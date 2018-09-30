package _02_multiple_inheritance;

public class Main {
  public static void main(String[] args) {

    Puppy puppy = new Puppy();

    puppy.weep();
    puppy.bark();
    puppy.eat();

    Cat cat = new Cat();
    cat.meow();
    cat.eat();
  }
}
