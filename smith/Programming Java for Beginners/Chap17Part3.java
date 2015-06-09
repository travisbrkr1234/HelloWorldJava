import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;

public class Chap17Part3
{
	public static void main(String[] args) throws IOException
	{
		String fileName = "grades.txt";
		Scanner inFile = new Scanner(new FileReader(fileName));
		int grade;

		while(inFile.hasNextLine())
		{
			grade = Integer.parseInt(inFile.nextLine());
			System.out.println(grade);
		}
	}
}