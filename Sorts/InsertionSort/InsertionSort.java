import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        // Declare Variables
        Scanner input = new Scanner(System.in);
        int listSize;
        int[] list;
        int valueToSort;
        int indexToCompareTo;

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
        for(int i = 0; i < list.length; i++) {
            if(i != (list.length - 1)) {
                System.out.print(list[i] + ", ");
            } else {
                System.out.print(list[i]);
            }
        }

        System.out.println();

        for(int index = 1; index < list.length; index++) {
            // Compare valueToSort to each value before it in the list
            valueToSort = list[index];
            indexToCompareTo = index - 1;

            while(indexToCompareTo >= 0 && (list[indexToCompareTo] > valueToSort)) {
                // Swap values
                list[indexToCompareTo + 1] = list[indexToCompareTo];
                list[indexToCompareTo] = valueToSort;
                indexToCompareTo--;
            }
        }

        // Print sorted list
        System.out.print("\tSorted List: ");
        for(int i = 0; i < list.length; i++) {
            if (i != (list.length - 1)) {
                System.out.print(list[i] + ", ");
            } else {
                System.out.print(list[i]);
            }
        }
    }
}
