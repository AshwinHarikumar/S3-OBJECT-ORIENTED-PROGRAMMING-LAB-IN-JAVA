import java.io.*;

public class FileSum {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter input file name: ");
			String infile = br.readLine();
			FileReader fis = new FileReader(infile);
			BufferedReader fileReader = new BufferedReader(fis);
			System.out.print("Enter output file name: ");
			String outfile = br.readLine();
			FileWriter fos = new FileWriter(outfile);
			BufferedWriter bw = new BufferedWriter(fos);
			String line;
			if ((line = fileReader.readLine()) != null) {
				String[] numbers = line.split("\\s+");
				int sum = 0;
				for (String num : numbers) {
					int currentNumber = Integer.parseInt(num);
					System.out.print(currentNumber + " ");
					sum += currentNumber;
					bw.write("Integer: " + num + "\n");
				}
				bw.write("Sum: " + sum);
				bw.close();
				System.out.println("\nSum and Integers copied to " + outfile);
			} else {
				System.out.println("Input file is empty.");
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}