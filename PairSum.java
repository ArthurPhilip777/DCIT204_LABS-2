import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        // 1. Prompt for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // 2. Accept each array element
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Prompt for the Target Sum
        System.out.print("Enter the Target Sum: ");
        int targetSum = scanner.nextInt();

        // 4. Brute Force (Nested Loop) Search
        boolean found = false;

        // Outer loop picks the first element
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop picks the second element (starts at i + 1 to avoid pairing an element with itself)
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    // 5. If found, display results
                    System.out.println("\n--------------------------------");
                    System.out.println("Pair Found!");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    System.out.println("--------------------------------");
                    found = true;
                    break; // Break the inner loop
                }
            }
            if (found) break; // Break the outer loop once a pair is found
        }

        // 6. If no pair exists
        if (!found) {
            System.out.println("\n--------------------------------");
            System.out.println("No pair exists that adds up to " + targetSum + ".");
            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}
