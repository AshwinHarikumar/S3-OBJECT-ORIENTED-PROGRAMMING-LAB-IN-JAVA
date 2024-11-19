// import java.io.*;
import java.util.*;

class Stringtokendemo {
	public static void main(String args[]) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integers separated by space: ");
		String s = sc.nextLine();

		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("Sum of INTEGERS is " + sum);
		sc.close();
	}
	
}
	
