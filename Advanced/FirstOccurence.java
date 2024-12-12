class FirstOccurence {
    public static int firstOccurence(int arr[], int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key, i+1);
    }

    public static int lastOccurence(int arr[], int key , int i){
        if(i == arr.length){
            return -1;
        }
        int found = lastOccurence(arr, key, i+1);

        if(found == -1 && arr[i] == key){
            return i;
        }
        return found;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,0,9,5};
        System.out.println(lastOccurence(arr, 5, 0));
    }
    
}