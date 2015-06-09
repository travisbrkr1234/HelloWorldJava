import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Chap15Part4
{
	public static void main(String[] args)
	{
		final int rows = 5;
		final int cols = 5;
		int[][] numbers = new int[rows][cols];
		Random rand = new Random(System.currentTimeMillis());

		for(int r = 0; r < rows; ++r)
			for(int c = 0; c< cols; ++c)
				numbers[r][c] = rand.nextInt(101);

		int[][] nums = {{10,20,30,40},{20,30,40,50},{30,40,50,60}};
		
	}
}