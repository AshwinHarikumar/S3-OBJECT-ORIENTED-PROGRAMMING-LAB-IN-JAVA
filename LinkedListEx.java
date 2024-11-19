import java.util.*;

class LinkedListEx {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("**MENU**\n1.Create\n2.Delete\n3.Display\n4.Exit\n");
		
		while (true) {
			System.out.print("\nChoose an option: ");
			int ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.print("Enter number of elements: ");
					int n = sc.nextInt();
					System.out.print("Enter the elements: ");
					for (int i = 0; i < n; i++) {
						int a = sc.nextInt();
						list.add(a);
					}
					break;
				case 2:
					System.out.print("Enter index to remove: ");
					int pos = sc.nextInt();
					System.out.print("The deleted element is: " + list.get(pos));
					list.remove(pos);
					break;
				case 3:
					Iterator<Integer> it = list.iterator();
					while (it.hasNext()) {
						System.out.print(it.next() + " ");
					}
					break;
				case 4:
					System.out.print("Exiting...");
					sc.close();
					return;
				default:
					System.out.print("Invalid option. Please try again.");
			}
		}
	}
}
