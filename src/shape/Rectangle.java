package shape;

import base.ShapeBase;
	
	/**
	 * The Rectangle class represents a rectangle shape.
	 * In inherits from shapeBase and overrides calculateArea().
	 * 
	 * @author Deveir Cockett
	 */

public class Rectangle extends ShapeBase 
{
	/**
	 * 
	 * Non default constructor for a rectangle.
	 */
	public Rectangle (int width, int height)
	{
		super("Rectangle", width, height);
	}
	
	/**
	 * Calculates the area of a rectangle
	 * formula width * height
	 * @return the rectangle area
	 */
	@Override
	public int calculateArea()
	{
		return width * height;
	}
	}


