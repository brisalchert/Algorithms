public class DoMergeSort {
    public static void mergeSort(int[] copy, int[] result, int start, int end) {
        if((end - start) < 2) {
            return;
        }

        if((end - start) == 2) {
            if(result[start] > result[end]) {
                int temp = result[start];
                result[start] = result[end];
                result[end] = temp;
            }

            return;
        }
    }
}