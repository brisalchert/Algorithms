public class MergeSort {
    public static void main(String[] args) {
        int[] list = {72, 12, 51, 7, 21, -6, 17, -56, 65, 91, 3};
        int[] copy = list;

        System.out.println();
        System.out.print("The unsorted list:\t");
        for(int index = 0; index < list.length; index++) {
            if(index != (list.length - 1)) {
                System.out.print(list[index] + ", ");
            }
            else {
                System.out.print(list[index]);
            }
        }

        DoMergeSort.mergeSort(copy, list, 0, (list.length - 1));

        System.out.println();
        System.out.print("The sorted list:\t");
        for(int index = 0; index < list.length; index++) {
            if(index != (list.length - 1)) {
                System.out.print(list[index] + ", ");
            }
            else {
                System.out.print(list[index]);
            }
        }

        System.out.println();
        System.out.println();
    }
}
