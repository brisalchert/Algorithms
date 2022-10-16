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

        int mid = (start + end) / 2;
        mergeSort(result, copy, start, mid);
        mergeSort(result, copy, mid, end);

        for(int index = start; index < mid; index++) {
            result[index] = copy[index];
        }

        for(int index = mid; index < end; index++) {
            result[index] = copy[index];
        }
    }
}
