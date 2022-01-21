class Main {
  public static void main(String[] args) {
    AutoCad autoCad = new AutoCad();

    Figure[] figures = new Figure[5];
    figures[0] = new Circle(0, 0, 5, "yellow");
    figures[1] = new Rectangle(5, 10, "red");
    figures[2] = new Triangle(5, 10, 7, "blue");
    figures[3] = new Square(20, "black");
    figures[4] = new Circle(7, 0, 3, "magenta");
    autoCad.print(figures);

    ((Triangle) figures[2]).makeCoffee();
  }
}