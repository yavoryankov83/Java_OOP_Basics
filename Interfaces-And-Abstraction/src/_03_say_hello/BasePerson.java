package _03_say_hello;

public abstract class BasePerson implements Person {
  private String name;

  protected BasePerson(String name) {
    this.setName(name);
  }

  @Override
  public String getName() {
    return this.name;
  }

  private void setName(String name) {
    this.name = name;
  }
}
