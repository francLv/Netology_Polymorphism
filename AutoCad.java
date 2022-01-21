import java.util.*;

public class AutoCad {

  public void print(Figure[] figures) {
    for (Figure figure : figures) {
      print(figure);
    }
  }

  public void print(Figure figure) {
    System.out.printf(
      "%s цвета %s, площадь: %.2f, периметр: %.2f\n",
      figure.getClass().getSimpleName(),
      figure.getColor(),
      figure.getArea(),
      figure.getPerimeter());
  }

  public void print(Figure figure, String ... params) {
    print(figure);
    System.out.println("А еще у фигуры есть параметры:");
    System.out.println(Arrays.toString(params));

  }
}