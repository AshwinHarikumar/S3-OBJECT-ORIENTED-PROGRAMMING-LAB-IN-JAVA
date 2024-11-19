import java.io.*;

class CopyCharFile {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter the source file name: ");
			String in = br.readLine();

			FileReader fis = new FileReader(in);
			System.out.print("Enter the destination file name: ");
			String out = br.readLine();

			FileWriter fos = new FileWriter(out);
			int bufferSize;
			char[] buffer = new char[1024];
			while ((bufferSize = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bufferSize);
			}
			fis.close();
			fos.close();
			System.out.println("File copied successfully.");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
