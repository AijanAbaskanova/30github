public class Debugging {
    public static void main(String[] args) {
        // Intentional error: Array index out of bounds
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accessing index 5: " + numbers[5]); // Error: Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid array index.");
        }

        // Corrected version
        System.out.println("Accessing a valid index 4: " + numbers[4]);
    }
}
