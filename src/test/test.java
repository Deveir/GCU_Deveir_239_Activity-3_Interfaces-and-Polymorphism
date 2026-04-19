package test;

import base.ShapeBase;
import shape.Rectangle;
import shape.Triangle;
import shape.circle;
import shape.Trapezoid;

/**
 * The Test class creates shape objects and demonstrates
 * polymorphism by storing different child classes in
 * a ShapeBase array.
 *
 * @author Deveir Cockett
 */
public class test
{
    /**
     * Helper method that displays the name and area
     * of a shape passed in as a ShapeBase reference.
     *
     * @param shape the shape to display
     */
    private static void displayArea(ShapeBase shape)
    {
        System.out.println(shape.getName() + " area: " + shape.calculateArea());
    }

    /**
     * Main method that creates shape objects, stores them
     * in an array, and displays their areas.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        ShapeBase[] shapes = new ShapeBase[4];

        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Triangle(8, 6);
        shapes[2] = new circle(4);
        shapes[3] = new Trapezoid(6, 10, 4);

        for (ShapeBase shape : shapes)
        {
            displayArea(shape);
        }
    }
}