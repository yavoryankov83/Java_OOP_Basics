package _03_say_hello;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();

    persons.add(new Bulgarian("Pesho"));
    persons.add(new European("Alfonso"));
    persons.add(new Chinese("Hjdkfkkf"));

    for (Person person : persons) {
      print(person);
    }
  }

  private static void print(Person person) {
    System.out.println(person.sayHello());
  }
}
