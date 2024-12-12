public class SearchingAlgo {
    public static int linerSer(int n[],int key){
        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == key){
                return 1;
            }
        }
        return -1;
    }

//--------------------------------------------------------
    public static int getGreatest(int n[]){
        int bigNum = Integer.MIN_VALUE;
        for (int num : n){
            if(bigNum < num){
                bigNum = num;
            }
        }
        return bigNum;
    }
//-----------------------------------------------------------
    public static int binarySearch(int num[], int key){
        int s = 0 ;
        int e = num.length-1;
        while (s <= e) {
            int mid = (s+e)/2;
            if(num[mid] == key){
                return num[mid];
            }
            if(num[mid] < key){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }

//----------------------------------------------------------
    public static void reverse(int nums[]){
        int first = 0 ;
        int last = nums.length-1;
        while (first<last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
//------------------------------------------------------------
    public static void printParis(int num[]){
        for(int i = 0 ; i < num.length; i++){
            int curr = num[i];
            for (int j = i+1 ; j < num.length ; j++){
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
//----------------------------------------------------------
    public static void Kadanes(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0 ; i < nums.length ; i++){
            cs = cs + nums[i];
            ms = Math.max(cs, ms);
            if(cs<0){
                cs = 0;
            }
        }
        System.out.println(ms);
    }
//------------------------------------------------------------
    public static void SubArrays(int[] numbers) {
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("-> "+numbers[k] + " ");
                }
                System.out.println();
                c++;
            }
        }
        System.out.println("Total SubArray Count : "+c);
    
    }
//-------------------------------------------------------------
    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0; 
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max SubArray Sum: " + maxSum);
    }

//-----------------------------------------------------------
    public static void prefixSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }
//-------------------------------------------------------------
    public static void MaxSum2(int num[]) {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                current = 0;
                for (int k = start; k <= end; k++) {
                    current += num[k];
                }
                System.out.println("Current sum: " + current);
                if (maxSum < current) {
                    maxSum = current;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSum);
    }
//-----------------------------------------------------------------
    public static void main(String[] args) {
        int n[] = {10,10,-8};
        //Kadanes(n);
        //SubArrays(n);
        
    }
}
