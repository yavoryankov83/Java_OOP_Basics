package _02_method_overriding;

public class Square extends Rectangle {

    public Square(Double sideA) {
        super(sideA, sideA);
    }

    @Override
    public Double area() {
        return super.getSideA() * super.getSideB();
    }
}
