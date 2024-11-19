import java.util.*;

class Synchronization extends Thread {
	public void display(int x) {
		System.out.println("Square of " + x + " is " + (x * x));
	}

	synchronized public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			display(2);
		} else if (name.equals("t2")) {
			display(3);
		} else {
			display(4);
		}
	}

	public static void main(String[] args) {
		Synchronization s = new Synchronization();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
