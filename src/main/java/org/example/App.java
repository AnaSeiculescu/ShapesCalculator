package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        Circle c1 = new Circle(4.5);
        double surfaceC1 = c1.calculateSurface();
        System.out.println("Surface c1 is: " + surfaceC1);

        MultipleShapesCalcul mySetOfShapes = new MultipleShapesCalcul();

//        HashSet<Shape> mySetOfShapes = new HashSet<>();
        Shape circle1 = new Circle(7);
        Shape triangle1 = new Triangle(9, 6, 12.5);
        Shape square1 = new Square(8);
        Shape rectangle1 = new Rectangle(10, 3);
        Shape square2 = new Square(13);
        Shape square3 = new Square(8);

        mySetOfShapes.addShape(circle1);
        mySetOfShapes.addShape(triangle1);
        mySetOfShapes.addShape(square1);
        mySetOfShapes.addShape(rectangle1);
        mySetOfShapes.addShape(square2);
        mySetOfShapes.addShape(square3);

        double myTotalPerimeter = mySetOfShapes.calculateTotalPerimeter();
        System.out.println("The total perimeter for my set of shapes is: " + myTotalPerimeter);
    }
}
