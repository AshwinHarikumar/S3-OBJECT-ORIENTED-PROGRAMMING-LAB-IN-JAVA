import java.util.*;

class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("**MENU**\n1.Insert\n2.Delete\n3.Display\n4.Exit");
		
		while (true) {
			System.out.print("\nChoose an option: ");
			int ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.print("Enter the element to insert: ");
					int n = sc.nextInt();
					list.add(n);
					break;
				case 2:
					System.out.print("Enter index to remove: ");
					int pos = sc.nextInt();
					System.out.print("The deleted element: " + list.get(pos));
					list.remove(pos);
					break;
				case 3:
					Iterator<Integer> it = list.iterator();
					while (it.hasNext()) {
						System.out.print(it.next() + " ");
					}
					break;
				case 4:
					System.out.print("Exiting the program..");
					System.exit(0);
					break;
				default:
					System.out.print("Invalid option. Please try again.");
			}
			sc.close();
		}
	}
	
}