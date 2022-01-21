public class Triangle extends Figure {

  private int ab;
  private int bc;
  private int ac;

  public Triangle(int ab, int bc, int ac, String color) {
    super(color);
    this.ab = ab;
    this.bc = bc;
    this.ac = ac;
  }

  @Override
  public double getPerimeter() {
    return ab + bc + ac;
  }

  @Override
  public double getArea() {
    double p = getPerimeter() / 2;
    double area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    return area;
  }

  public void makeCoffee() {
    System.out.println("сварил кофе");
  }
}