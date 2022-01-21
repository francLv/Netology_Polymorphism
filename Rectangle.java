public class Rectangle extends Figure {

  private int ab;
  private int bc;

  public Rectangle(int ab, int bc, String color) {
    super(color);
    this.ab = ab;
    this.bc = bc;
  }

  @Override
  public double getPerimeter() {
    return 2 * (ab + bc);
  }

  @Override
  public double getArea() {
    return ab * bc;
  }
}