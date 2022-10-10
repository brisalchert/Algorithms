//------------------------------------------------
// The BubbleSort program takes a list of seven
// integers from the user and sorts them in
// ascending order using a basic bubble sort
//------------------------------------------------

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int itemsToSort;
        Scanner input = new Scanner(System.in);

        // Ask user for the number of items to sort
        System.out.print("Enter the number of integers to sort: ");
        itemsToSort = input.nextInt();

        // Check input validity
        while(itemsToSort < 2) {
            System.out.print("Number must be at least 2. Please re-enter: ");
            itemsToSort = input.nextInt();
        }

        // Set input list length
        int[] list = new int[itemsToSort];

        // Take input of a list of integers as an array
        System.out.print("Enter a list of " + itemsToSort + " integers"
                        + " (delimited by spaces): ");
        for(int i = 0; i < itemsToSort; i++) {
            list[i] = input.nextInt();
        }

        // Sort the list
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length - i - 1; j++) {
                // Compare two adjacent values
                if(list[j] > list[j + 1]) {
                    // Swap the values
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        // Output the sorted list
        System.out.println();
        System.out.print("\tThe sorted list: ");

        for(int index = 0; index < list.length; index++) {
            if(index != (list.length - 1)) {
                System.out.print(list[index] + ", ");
            } else {
                System.out.print(list[index]);
            }
        }

        System.out.println();
        System.out.println();
    }
}