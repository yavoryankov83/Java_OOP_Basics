import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private int age;
  private List<BankAccount> accoounts;

  public Person(String name, int age) {
    this(name, age, new ArrayList<>());
  }

  public Person(String name, int age, List<BankAccount> accoounts) {
    this.name = name;
    this.age = age;
    this.accoounts = accoounts;
  }

  public double getBalance() {
    return this.accoounts.stream().mapToDouble(c -> c.getBalance()).sum();
  }
}
