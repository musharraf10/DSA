public class CountingSort {
    public static void Counting(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            large = Math.max(large,arr[i]);
        }
        int count[] = new int[large+1];
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0 ; i < count.length; i++){
            while (count[i] > 0) {
                arr[j] = i ;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        Counting(arr);
        printArray(arr);
    }
}
