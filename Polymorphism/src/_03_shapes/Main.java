package _03_shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3);

        rectangle.calculateArea();
        circle.calculateArea();

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
    }
}
