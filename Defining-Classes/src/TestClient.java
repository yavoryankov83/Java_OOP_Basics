import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestClient {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;

    Map<Integer, BankAccount> accounts = new HashMap<>();

    while (!"END".equals(input = reader.readLine())) {
      String[] tokens = input.split("\\s+");

      String command = tokens[0];
      int id = Integer.parseInt(tokens[1]);

      switch (command) {
        case "Create":
          if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
          } else {
            accounts.put(id, new BankAccount());
          }
          break;

        case "Deposit":
          double amountOfDeposit = Double.parseDouble(tokens[2]);
          if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
          } else {
            accounts.get(id).deposit(amountOfDeposit);
          }
          break;

        case "Withdraw":
          double amountWithraw = Double.parseDouble(tokens[2]);
          if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
          } else if (accounts.get(id).getBalance() < amountWithraw) {
            System.out.println("Insufficient balance");
          } else {
            accounts.get(id).withDraw(amountWithraw);
          }
          break;

        case "Print":
          if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
          } else {
            double balance = accounts.get(id).getBalance();

            System.out.printf("Account ID%d, balance %.2f%n", id, balance);
          }
          break;
      }
    }
  }
}
