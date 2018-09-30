package _02_person_salary;

public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private double salary;

  public Person(String firstName, String lastName, int age, double salary) {
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setAge(age);
    this.setSalary(salary);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double increaseSalary(double bonus) {
    if (this.getAge() < 30) {
      bonus = bonus / 2;
    }
    return this.salary += this.salary * bonus / 100;
  }

  @Override
  public String toString() {
    return String.format("%s %s gets %.2f leva", this.getFirstName(), this.getLastName(), this.getSalary());
  }
}
