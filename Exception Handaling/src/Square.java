
public class Square
{

	private double length;

	public Square(double length)
	{

		this.setLength(length);
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length) throws IllegalArgumentException
	{
		if (length >= 0)
			this.length = length;
		else
		{
			this.length = Math.abs(length);
			throw new IllegalArgumentException("You cannot have a negative length. Length defaulted to abs value of " + length);			
		}
	}

	public double getArea()
	{
		return this.length * this.length;
	}

	public double getPerimeter()
	{
		return this.length * 4;
	}

	public double getDiagonal()
	{
		return Math.sqrt((this.length * this.length)+(this.length * this.length));
	}

	@Override
	public String toString()
	{
		return "Square length = " + length
				+ ", area = " + getArea() + ", perimeter = "
				+ getPerimeter() + ", diagonal = " + getDiagonal();
	}

}
