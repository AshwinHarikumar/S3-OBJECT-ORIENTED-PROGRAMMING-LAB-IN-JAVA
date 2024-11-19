import java.util.*;


public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (true) {
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Display Array Elements");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int elementToInsert = scanner.nextInt();
                    arrayList.add(elementToInsert);
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    int elementToDelete = scanner.nextInt();
                    if (arrayList.remove((Integer) elementToDelete)) {
                        System.out.println("Element deleted successfully.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.println("Array Elements: " + arrayList);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
