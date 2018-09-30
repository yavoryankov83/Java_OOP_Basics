package _04_team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
  private String name;
  private List<Person> firstTeamPlayers;
  private List<Person> reserveTeamPlayers;

  public Team(String name) {
    this.setName(name);
    this.firstTeamPlayers = new ArrayList<>();
    this.reserveTeamPlayers = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Person> getFirstTeamPlayers() {
    return Collections.unmodifiableList(firstTeamPlayers);
  }

  public List<Person> getReserveTeamPlayers() {
    return Collections.unmodifiableList(reserveTeamPlayers);
  }

  public void addPlayer(Person person) {
    if (person.getAge() < 40) {
      this.firstTeamPlayers.add(person);
    } else {
      this.reserveTeamPlayers.add(person);
    }
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    return builder.append("First team have ")
            .append(firstTeamPlayers.size())
            .append(" players")
            .append(System.getProperty("line.separator"))
            .append("Reserved team have ")
            .append(reserveTeamPlayers.size())
            .append(" players")
            .toString();
  }
}
