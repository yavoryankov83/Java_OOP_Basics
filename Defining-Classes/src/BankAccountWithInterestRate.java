public class BankAccountWithInterestRate {

  private static final double DEFAULT_INTEREST = 0.02;
  private static double interestRate = DEFAULT_INTEREST;
  private static int bankAccountCount;

  private int id;
  private double balance;


  public BankAccountWithInterestRate() {
    this.id = ++bankAccountCount;
  }

  public int getId() {
    return id;
  }

  public static void setInterestRate(double interest) {
    interestRate = interest;
  }

  public double getInterest(int years) {
    return this.balance * interestRate * years;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  @Override
  public String toString() {
    return String.format("\"ID\"%d", this.id);
  }
}
