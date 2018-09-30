package _05_stack_of_strings;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack {
  private ArrayList<String> data;

  public Stack() {
    this.data = new ArrayList<>();
  }

  public void push(String item) {
    this.data.add(item);
  }

  public String pop() {
    if (!this.isEmpty()) {
      return this.data.remove(this.data.size() - 1);
    } else {
      throw new NoSuchElementException();
    }
  }

  public String peek() {
    if (!this.isEmpty()) {
      return this.data.get(this.data.size() - 1);
    } else {
      throw new NoSuchElementException();
    }
  }

  public boolean isEmpty() {
    return this.data.isEmpty();
  }
}
