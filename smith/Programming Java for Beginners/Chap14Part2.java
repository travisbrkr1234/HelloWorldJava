import java.util.Scanner;
import java.util.ArrayList;

public class Chap14Part2
{
	public static void main(String[] args)
	{
		Shape s1 = new Shape(2,3);
		Circle c1 = new Circle(10,20,5);
		Rectangle r1 = new Rectangle(50,100,10,20);

		s1.draw();
		c1.draw();
		r1.draw();
	}
}