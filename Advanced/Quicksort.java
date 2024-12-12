public class Quicksort{
    
    public static void printarr(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int part=partition(arr,si,ei);
        quicksort(arr,si,part-1);
        quicksort(arr,part+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int temp;
        int i=si-1;
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivot){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    
}