package _03_say_hello;

public class European extends BasePerson {

  public European(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String sayHello() {
    return "Hello";
  }
}
