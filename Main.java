import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
     public static void main(String[] args) {
         ArrayList<GeometryFigures> figures = new ArrayList<GeometryFigures>();
        
         figures.add(new Circle(5));
         figures.add(new Square(4));
         figures.add(new Triangle(4,3));

         // Sort figures by area using the Comparable implementation
         Collections.sort(figures);

         // Using an iterator to display figure features
         Iterator<GeometryFigures> iterator = figures.iterator();
         while (iterator.hasNext()) {
             GeometryFigures figure = iterator.next();
             System.out.println(figure.getName());
             System.out.println("Area: " + figure.calculateArea());
             System.out.println("Perimeter: " + figure.calculatePerimeter());
             System.out.println();
         }
     }
}
