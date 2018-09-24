public class BankAccount {
  private int id;
  private double balance;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withDraw(double amount) {
    this.balance -= amount;
  }

  @Override
  public String toString() {
    return String.format("Account %d, balance %.2f", this.getId(), this.getBalance());
  }
}
