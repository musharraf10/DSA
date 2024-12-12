public class NumberSys{

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }


    public static int fact(int n){
        int fact = 1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i = 1 ; i <= n ; i++){
            fact*=i;
        }
        return fact;
    }
//------------------------------------------------------------

    public static int calcSum(int n){
        if(n ==1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        return n+snm1;
    }
//-----------------------------------------------------------
    public static int BinoCofi(int n , int r){
        int factN = fact(n);
        int factR = fact(r);
        int factN_R = fact(n-r);
        return factN/factR*factN_R;
    }

    // Number System Binary to Decimal
    public static int BinToDec(int BinNum){
        int pow = 0;
        int decNum = 0;
        while(BinNum > 0){
            int lastDigit = BinNum%10;
            decNum += (lastDigit * (int) Math.pow(2,pow));
            pow++;
            BinNum = BinNum/10;
        }
        return decNum ;
    }

    public static int DecToBin(int decNum){
        int pow = 0 ;
        int binNum = 0;
        while (decNum>0) {
            int rem = decNum%2;
            binNum += (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        return binNum;
    }

    public static int AddBinaryNum(int num1, int num2){
        return DecToBin(BinToDec(num1)+BinToDec(num2));
    }
    public static void main(String[] args) {
        System.out.print(AddBinaryNum(111,100));
    }
}