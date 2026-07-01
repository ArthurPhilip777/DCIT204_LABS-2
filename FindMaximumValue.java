import java.util.Scanner;

public class FindMaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        // 1. Prompt for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // 2. Create the integer array
        int[] numbers = new int[size];

        // 3. Prompt the user to enter each element
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Search for the maximum value and its index
        // Initialize with the first element assuming the array is not empty
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.size(); i++) { // Using standard array length
        // Correction: numbers.length is used for arrays in Java
