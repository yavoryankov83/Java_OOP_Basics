package _03_shapes;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.setRadius(radius);
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  protected void calculateArea() {
    setArea(Math.PI * this.radius * this.radius);
  }

  @Override
  protected void calculatePeremeter() {
    setPerimeter(Math.PI * 2 * this.radius);
  }
}
