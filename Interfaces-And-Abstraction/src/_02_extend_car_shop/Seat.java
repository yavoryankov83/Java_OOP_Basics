package _02_extend_car_shop;

import java.io.Serializable;

public class Seat implements Sellable, Serializable {

  private String countryProduced;
  private String model;
  private String color;
  private Integer horsePower;
  private Double price;

  public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
    this.setModel(model);
    this.setColor(color);
    this.setHorsePower(horsePower);
    this.setCountryProduced(countryProduced);
    this.setPrice(price);
  }

  @Override
  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String getColor() {
    return this.color;
  }

  public void setColor(String colour) {
    this.color = colour;
  }

  @Override
  public Integer getHorsePower() {
    return this.horsePower;
  }

  public void setHorsePower(Integer horsePower) {
    this.horsePower = horsePower;
  }

  public String getCountryProduced() {
    return this.countryProduced;
  }

  public void setCountryProduced(String countryProduced) {
    this.countryProduced = countryProduced;
  }

  @Override
  public Double getPrice() {
    return this.price;
  }

  private void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format(
            "This is %1$s produces in %2$s and have %3$d tyres"
            , this.getModel()
            , this.getCountryProduced()
            , TYRES);
  }
}
