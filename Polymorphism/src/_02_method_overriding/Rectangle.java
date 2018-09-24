package _02_method_overriding;

public class Rectangle {
    private Double sideA;
    private Double sideB;


    public Rectangle(Double sideA, Double sideB) {
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    public Double area() {
        return this.sideA * this.sideB;
    }
}
