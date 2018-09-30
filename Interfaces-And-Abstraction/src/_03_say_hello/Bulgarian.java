package _03_say_hello;

public class Bulgarian extends BasePerson {

  public Bulgarian(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String sayHello() {
    return "Здравей";
  }
}
