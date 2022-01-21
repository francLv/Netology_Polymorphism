public class Square extends Figure {

  private int side;

  public Square(int side, String color) {
    super(color);
    this.side = side;
  }

  @Override
  public double getPerimeter() {
    return 4 * side;
  }

  @Override
  public double getArea() {
    return Math.pow(side, 2);
  }
}