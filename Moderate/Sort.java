public class Sort {
    public static void BubbleSort(int arr[]){
        int len = arr.length;
        for(int turn = 0 ; turn < len ; turn++){
            for(int j = 0 ; j < len-1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            int minPos = i;
            for(int j = i+1 ; j < len ; j++){
                
            }
        }

    }

    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,1,5,3,2};
        BubbleSort(arr);
        printArr(arr);
    }
}



