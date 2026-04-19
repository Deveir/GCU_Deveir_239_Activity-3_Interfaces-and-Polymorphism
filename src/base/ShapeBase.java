package base;

/**
 * The ShapeBase class is a parent class for all shapes.
 * It implements the ShapeInterface and provides shared
 * properties such as width, height, and name.
 *
 * @author Deveir Cockett
 */
public class ShapeBase implements ShapeInterface
{
    /** The width of the shape */
    protected int width;

    /** The height of the shape */
    protected int height;

    /** The name of the shape */
    protected String name;

    /**
     * Non-default constructor used to initialize
     * the name, width, and height of the shape.
     *
     * @param name the name of the shape
     * @param width the width of the shape
     * @param height the height of the shape
     */
    public ShapeBase(String name, int width, int height)
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    /**
     * Default calculateArea method for the base class.
     * Child classes should override this method.
     *
     * @return -1 to show area is not defined in ShapeBase
     */
    @Override
    public int calculateArea()
    {
        return -1;
    }

    /**
     * Gets the name of the shape.
     *
     * @return the shape name
     */
    public String getName()
    {
        return name;
    }
}