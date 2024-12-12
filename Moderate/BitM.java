public class BitM {
    public static void EvenorOdd(int n){
        int mask = 1;
        if((n & mask) == 0){
            System.out.println("Even number :"+n);
        }else{
            System.out.println("Odd Number :"+n);
        }
    }

    public static int getIthBit(int n , int i){
        int mask = 1<<i;
        if((n & mask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n , int i){
        int mask = 1<<i;
        return n | mask; 
    }

    public static int clearIthBit(int n , int i){
        int mask = ~(1<<i);
        return n & mask;
    }


    public static int countSetBit(int n){
        int c = 0 ;
        while(n > 0){
            if((n & 1) != 0){
                c++;
            }
            n = n >> 1;
        }
        return c;
    }

    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        //EvenorOdd(6);
        System.out.println(isPowerofTwo(4));
    }
}
