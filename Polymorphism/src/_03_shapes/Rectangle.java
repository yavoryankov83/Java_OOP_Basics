package _03_shapes;

public class Rectangle extends Shape {

  private double height;
  private double width;

  public Rectangle(double height, double width) {
    this.setHeight(height);
    this.setWidth(width);
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  protected void calculateArea() {
    setArea(this.height * this.width);
  }

  @Override
  protected void calculatePeremeter() {
    setPerimeter(this.height * 2 + this.width * 2);
  }
}
