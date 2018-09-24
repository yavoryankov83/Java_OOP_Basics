package _01_car_shop;

import java.io.Serializable;

public class Seat implements Car, Serializable {

    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        this.setCountryProduced(countryProduced);
        this.setModel(model);
        this.setColor(color);
        this.setHorsePower(horsePower);
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
    public String toString() {
        return String.format(
                "This is %1$s produces in %2$s and have %3$d tyres"
                , this.getModel()
                , this.getCountryProduced()
                , TYRES);

        //This is Leon produced in Spain and have 4 tires
    }
}
