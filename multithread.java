import java.util.*;

class OddThread extends Thread {
	int cube;

	OddThread(int cube) {
		this.cube = cube;
	}

	public void run() {
		if (cube < 0) {
			cube = cube * (-1);
		}
		System.out.println("Cube of " + cube + " is: " + cube * cube * cube);
	}
}

class EvenThread extends Thread {
	int sq;

	EvenThread(int sq) {
		this.sq = sq;
	}

	public void run() {
		if (sq < 0) {
			sq = sq * (-1);
		}
		System.out.println("Square of " + sq + " is: " + sq * sq);
	}
}

class RandThread extends Thread {
	int n;

	RandThread(int n) {
		this.n = n;
	}

	public void run() {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int nn = r.nextInt(100);
			if (nn % 2 == 0) {
				EvenThread t2 = new EvenThread(nn);
				t2.start();
			} else {
				OddThread t3 = new OddThread(nn);
				t3.start();
			}
		}
	}
}

public class multithread {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int l = sc.nextInt();

		RandThread t1 = new RandThread(l);
		t1.start();

		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}