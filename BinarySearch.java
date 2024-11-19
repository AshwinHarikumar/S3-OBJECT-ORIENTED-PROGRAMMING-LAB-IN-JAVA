import java.util.*;

class BinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the elements in the array (sorted for binary search): ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list.add(x);
		}
		
		// Bubble sort to ensure the array is sorted
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
		System.out.print("Sorted array: ");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		System.out.print("Enter the element to search: ");
		int key = sc.nextInt();
		
		int low = 0;
		int high = n - 1;
		int mid = 0;
		boolean found = false;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if (list.get(mid) == key) {
				System.out.println("Element found at position: " + (mid + 1));
				found = true;
				break;
			} else if (list.get(mid) < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		if (!found) {
			System.out.println("Element not found in the array.");
		}
		sc.close();
	}
}
