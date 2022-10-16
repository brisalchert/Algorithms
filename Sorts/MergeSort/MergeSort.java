public class MergeSort {
    public static void main(String[] args) {
        int[] list = {4, 3, 2, 1};
        int[] copyList = new int[list.length];

        for(int i = 0; i < list.length; i++) {
            copyList[i] = list[i];
        }

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

        DoMergeSort.mergeSort(copyList, list, 0, (list.length - 1));

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
