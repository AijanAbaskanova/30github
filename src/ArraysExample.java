public class ArraysExample {


        public static void main(String[] args) {
            // Creating and initializing an array
            int[] numbers = new int[5];

            // Assigning values to the array
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (i + 1) * 10; // Filling with 10, 20, 30, 40, 50
            }

            // Printing the array elements
            System.out.println("Array Elements:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Finding the sum of array elements
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of array elements: " + sum);

            // Finding the maximum element in the array
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum element in the array: " + max);

    }



}
