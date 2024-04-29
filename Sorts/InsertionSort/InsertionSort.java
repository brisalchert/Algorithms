import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        // Declare Variables
        Scanner input = new Scanner(System.in);
        int listSize;
        int[] list;

        // Ask user for input
        System.out.print("Enter number of integers to sort: ");
        listSize = input.nextInt();

        list = new int[listSize];

        System.out.print("Enter " + listSize + " integers (delimited by spaces): ");
        for(int i = 0; i < listSize; i++) {
            list[i] = input.nextInt();
        }

        // Print unsorted list
        System.out.print("\tUnsorted List: ");
        printList(list);

        System.out.println();

        // Sort the list
        list = insertionSort(list);

        // Print sorted list
        System.out.print("\tSorted List: ");
        printList(list);

        input.close();
    }

    public static void printList(int[] list) {
        for(int i = 0; i < list.length; i++) {
            if (i != (list.length - 1)) {
                System.out.print(list[i] + ", ");
            } else {
                System.out.print(list[i]);
            }
        }
    }

    public static int[] insertionSort(int[] list) {
        for(int index = 1; index < list.length; index++) {
            // Compare valueToSort to each value before it in the list
            int valueToSort = list[index];
            int indexToCompareTo = index - 1;

            while(indexToCompareTo >= 0 && (list[indexToCompareTo] > valueToSort)) {
                // Swap values
                list[indexToCompareTo + 1] = list[indexToCompareTo];
                list[indexToCompareTo] = valueToSort;
                indexToCompareTo--;
            }
        }

        return list;
    }
}
