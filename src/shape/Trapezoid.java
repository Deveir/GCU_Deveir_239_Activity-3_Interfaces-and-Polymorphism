package shape;

import base.ShapeBase;

/**
 * The Trapezoid class represents a trapezoid shape.
 * It inherits from ShapeBase and overrides calculateArea().
 *
 * In this class:
 * - width is the first base
 * - height is the second base
 * - the trapezoid height is fixed at 4 for simplicity
 *
 * @author Deveir Cockett
 */
public class Trapezoid extends ShapeBase
{
    /** The height of the trapezoid */
    private int trapezoidHeight;

    /**
     * Non-default constructor for a Trapezoid.
     *
     * @param base1 the first base
     * @param base2 the second base
     * @param trapezoidHeight the height of the trapezoid
     */
    public Trapezoid(int base1, int base2, int trapezoidHeight)
    {
        super("Trapezoid", base1, base2);
        this.trapezoidHeight = trapezoidHeight;
    }

    /**
     * Calculates the area of a trapezoid.
     *
     * Formula: ((base1 + base2) * height) / 2
     *
     * @return the trapezoid area
     */
    @Override
    public int calculateArea()
    {
        return ((width + height) * trapezoidHeight) / 2;
    }
}