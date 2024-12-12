public class Recurssion {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }


    public static int calcSum(int n){
        if(n ==1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        return n+snm1;
    }

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

    public static int power(int x, int n){
        if(n==0){
            return 0;
        }
        return x * power(x, n-1);
    }

    public static int Optipower(int x, int n){
        if(n==0){
            return 0;
        }
        int halfPower = Optipower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n * 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }


    public static void PrintBinaryString(int n , int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        PrintBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            PrintBinaryString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        PrintBinaryString(3, 0,"");
    }

}
