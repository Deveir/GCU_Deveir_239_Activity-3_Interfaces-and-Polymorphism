package shape;

import base.ShapeBase;
/**
 * The Triangle class represents a triangle shape.
 * It inherits from ShapeBase and overrides calculateArea().
 *
 * @author Deveir Cockett
 */
public class Triangle extends ShapeBase
{
    /**
     * Non-default constructor for a Triangle.
     *
     * @param width the width of the triangle
     * @param height the height of the triangle
     */
    public Triangle(int width, int height)
    {
        super("Triangle", width, height);
    }

    /**
     * Calculates the area of a triangle.
     *
     * Formula: (width * height) / 2
     *
     * @return the triangle area
     */
    @Override
    public int calculateArea()
    {
        return (width * height) / 2;
    }
}