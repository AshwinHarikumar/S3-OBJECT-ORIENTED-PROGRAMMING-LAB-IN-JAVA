import java.util.*;
class Queue {
	int N;
	int front = -1,rear = -1;
	int queue[];
	Queue(int N) {
		this.N = N;
		queue = new int[N];
		System.out.println("Queue length is " + N);
	}
	void enqueue(int item) {
		if (rear >= N-1) {
			System.out.println("Queue overflow!");
		}
		else if (front == -1 && rear == -1) {
			front = front+1;
			rear = rear+1;
			queue[rear] = item;
			System.out.println(item + " is enqueued into queue");
		}
		else {
			rear = rear+1;
			queue[rear] = item;
			System.out.println(item + " is enqueued into queue");
		}
	}
	void dequeue() {
		int item;
		if (front == -1 && rear == -1) {
			System.out.println("Queue underflow!");
		}
		else if (front == rear) {
			item = queue[front];
			front = -1;
			rear = -1;
			System.out.println("Dequeued " + item);
		}
		else {
			item = queue[front];
			front = front+1;
			System.out.println("Dequeued " + item);
		}
	}
	void display() {
		if (front == -1 && rear == -1) {
			System.out.println("Queue empty!");
		}
		else {
			System.out.print("[");
			for (int i=front; i<rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.print(queue[rear] + "]\n");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter queue legnth:- ");
		Queue queue = new Queue(sc.nextInt());
		int choice = 0;
		while (choice != 4) {
			System.out.println("\n1.insert\n2.delete\n3.Display\n4.Exit");
			System.out.print("Enter your choice:-");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1: System.out.print("Enter value to insert:- ");
						int item = sc.nextInt();
						queue.enqueue(item);
						break;
				case 2: queue.dequeue();
						break;
				case 3: queue.display();
						break;
				case 4: System.out.println("Exituing...");
						break;
			}
		}
	}
}
