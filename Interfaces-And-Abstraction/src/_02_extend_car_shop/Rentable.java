package _02_extend_car_shop;

public interface Rentable extends Car {

    Integer getMinRentDay();

    Double getPricePerDay();
}
