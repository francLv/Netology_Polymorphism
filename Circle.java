public class Circle extends Figure {

  private Point center;
  private int radius;

  public Circle(Point center, int radius, String color) {
    super(color);
    this.center = center;
    this.radius = radius;
  }

  public Circle(int x, int y, int radius, String color) {
    this(new Point(x, y), radius, color);
    // super(color);
    // this.center = new Point(x, y);
    // this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * getRadius();
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(getRadius(), 2);
  }
}