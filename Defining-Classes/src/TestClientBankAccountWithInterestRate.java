import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestClientBankAccountWithInterestRate {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;

    Map<Integer, BankAccountWithInterestRate> accounts = new HashMap<>();

    while (!"END".equals(input = reader.readLine())) {
      String[] tokens = input.split("\\s+");

      String command = tokens[0];

      switch (command) {
        case "Create":
          BankAccountWithInterestRate acc = new BankAccountWithInterestRate();
          accounts.put(acc.getId(), acc);
          System.out.printf("Account ID%d created%n", acc.getId());
          break;

        case "Deposit":
          int id = Integer.parseInt(tokens[1]);
          double amount = Double.parseDouble(tokens[2]);

          try {
            accounts.get(id).deposit(amount);
            System.out.printf("Deposited %.2f to ID%d%n", amount, id);
          } catch (Exception ex) {
            System.out.println("Account does not exist");
          }
          break;

        case "SetInterest":
          int setIdInterest = Integer.parseInt(tokens[1]);

          BankAccountWithInterestRate.setInterestRate(Double.parseDouble(tokens[1]));
          break;

        case "GetInterest":
          int interestId = Integer.parseInt(tokens[1]);
          int years = Integer.parseInt(tokens[2]);

          try {
            accounts.get(interestId).getInterest(years);
            double interest = accounts.get(interestId).getInterest(years);
            System.out.printf("%.2f%n", interest);
          } catch (Exception ex) {
            System.out.println("Account does not exist");
          }
          break;
      }
    }
  }
}
