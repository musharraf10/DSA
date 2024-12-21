public class TCS21Code1{
    public static float Solidity(int X, int A, int B){
        int res = A;
        while(X < 100){
            res += B;
            ++X;
        }
       // System.out.print(res);
        return (res/100f);
    }
    public static void main(String[] args){
        // System.out.printf("%.2f", Solidity(40, 120, 1));  // Output: 1.80
        // System.out.println();
        // System.out.printf("%.2f", Solidity(35, 120, 2));  // Output: 2.50
        System.out.println(String.format("%.2f", Solidity(40, 120, 1)));  // Output: 1.80
        System.out.println(String.format("%.2f", Solidity(35, 120, 2)));  // Output: 2.50
    }
}