import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileStatsCounter {
	public static void main(String[] args) {
		int characterCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the file name: ");
			String fileName = scanner.nextLine();
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				lineCount++;
				String[] words = line.split("\\s+");
				wordCount += words.length;
				characterCount += line.length();
			}

			bufferedReader.close();
			System.out.println("Total number of characters: " + characterCount);
			System.out.println("Total number of words: " + wordCount);
			System.out.println("Total number of lines: " + lineCount);
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
		
	}
	
}
