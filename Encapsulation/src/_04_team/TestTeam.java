package _04_team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTeam {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    Team team = new Team("Barca");

    while (count-- > 0) {

      String[] input = reader.readLine().split("\\s+");

      Person person = null;

      try {
        person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
      } catch (IllegalArgumentException ex) {
        System.out.println(ex.getMessage());
      }

      if (person != null) {
        team.addPlayer(person);
      }
    }

    System.out.println(team);
  }
}
