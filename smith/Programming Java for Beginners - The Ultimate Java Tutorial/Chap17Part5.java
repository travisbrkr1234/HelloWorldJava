import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Chap17Part5
{
	public static void main(String[] args) throws IOException
	{
		String fileName = "chars.txt";
		PrintWriter outFile = new PrintWriter(new FileWriter(fileName));

		String sentence = "now is the time for all good people";

		for(int i = 0; i < sentence.length(); ++i) 
		{
			outFile.write(sentence.charAt(i));
			outFile.print("\r\n");
		}
		outFile.close();
	}
}