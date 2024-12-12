public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) { // Base case: single element is already sorted
            return;
        }

        int mid = si + (ei - si) / 2; // Calculate the middle index

        // Recursively sort the left and right halves
        mergeSort(arr, si, mid);      // Left part
        mergeSort(arr, mid + 1, ei); // Right part

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Temporary array for merging
        int i = si;     // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0;      // Iterator for temp array

        // Merge the two parts into temp[]
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left part, if any
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right part, if any
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 7, 8};
        mergeSort(arr, 0, arr.length - 1); // Call mergeSort on the entire array
        printArr(arr); // Print the sorted array
    }
}
