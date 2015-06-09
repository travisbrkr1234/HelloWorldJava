public class RectangleI implements ShapeI
{
	private int x;
	private int y;
	private int width;
	private int height;

	RectangleI(int xcor, int ycor, int w, int h)
	{
		x=xcor;
		y=ycor;
		width=w;
		height=h;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}

	public void setX(int xcor)
	{
		x= xcor;
	}
	public void setY(int ycor)
	{
		y=ycor;
	}
	public void setWidth(int w)
	{
		width = w;
	}
	public void setHeight(int h)
	{
		height = h;
	}

	public void draw()
	{
		System.out.println("Drawing ractangle");
	}
}