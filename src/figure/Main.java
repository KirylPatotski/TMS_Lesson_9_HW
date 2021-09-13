package figure;
import figure.circle.Circle;
import figure.rectangle.Rectangle;
import figure.square.Square;
import figure.triangle.Triangle;
import java.util.Arrays;

/**
 * This class simulates the behavior of this program.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,7);
        int area = rectangle.calculateArea(rectangle);
        System.out.println("Area: " + area);
        int scope = rectangle.calculateScope(rectangle);
        System.out.println("Scope: " + scope);

        Square square = new Square(3);
        area = square.calculateArea(square);
        System.out.println("Area: " + area);
        scope = square.calculateScope(square);
        System.out.println("Scope: " + scope);

        Triangle triangle = new Triangle(4,13,14,4);
        area = triangle.calculateArea(triangle);
        System.out.println("Area: " + area);
        scope = square.calculateScope(triangle);
        System.out.println("Scope: " + scope);

    }
}
