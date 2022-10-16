public class DoMergeSort {
    public static void mergeSort(int[] copy, int[] result, int start, int end) {
        // Base Cases
        if((end - start) < 1) {
            return;
        }

        if((end - start) == 1) {
            if(result[start] > result[end]) {
                int temp = result[start];
                result[start] = result[end];
                result[end] = temp;
            }

            return;
        }

        // Recursive Case
        int mid = (start + end) / 2;
        mergeSort(result, copy, start, mid);
        mergeSort(result, copy, mid, end);

        int leftIndex = start;
        int rightIndex = mid;
        int resultIndex = start;

        while(resultIndex < end) {
            if(rightIndex >= end || (leftIndex < mid && copy[leftIndex] < copy[rightIndex])) {
                result[resultIndex] = copy[leftIndex];

                leftIndex++;
            }
            else {
                result[resultIndex] = copy[rightIndex];

                rightIndex++;
            }

            resultIndex++;
        }
    }
}
