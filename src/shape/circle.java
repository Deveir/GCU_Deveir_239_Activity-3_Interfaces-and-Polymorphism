package shape;

import base.ShapeBase;

/**
 * The Circle class represents a circle shape.
 * It inherits from ShapeBase and overrides calculateArea().
 *
 * Width is used as the radius. Height is not used.
 *
 * @author Deveir Cockett
 */
public class circle extends ShapeBase
{
    /**
     * Non-default constructor for a Circle.
     *
     * @param radius the radius of the circle
     */
    public circle(int radius)
    {
        super("Circle", radius, 0);
    }

    /**
     * Calculates the area of a circle.
     *
     * Formula: pi * r * r
     * This version uses 3 for pi to keep the return type int.
     *
     * @return the circle area
     */
    @Override
    public int calculateArea()
    {
        return 3 * width * width;
    }
}
