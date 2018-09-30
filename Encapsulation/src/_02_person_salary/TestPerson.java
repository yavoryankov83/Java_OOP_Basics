package _02_person_salary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestPerson {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());
    List<Person> people = new ArrayList<>();

    while (count-- > 0) {

      String[] input = reader.readLine().split("\\s+");

      Person person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));

      people.add(person);
    }

    double bonus = Double.parseDouble(reader.readLine());

    for (Person person : people) {
      person.increaseSalary(bonus);
      System.out.println(person.toString());
    }
  }
}