import java.util.*;

// Custom Exception for negative array size
class NegativeArraySizeException extends Exception {
    public NegativeArraySizeException(String message) {
        super(message);
    }
}

public class ArraySize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative");
            }
            int[] array = new int[size];
            System.out.println("Array of size " + size + " created successfully");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
