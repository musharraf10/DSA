import java.util.*;
public class EvenOdd {

    public static void  EvenOddSum(int n) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;    
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
//----------------------------------------------------------------------------//

    public static void EvenOddNUmber(int a , int b){
        for( int i = a; i <= b; i++) {
            if( i % 2 == 0) {
                System.out.println("Even Number: " + i);
            } else {
                System.out.println("Odd Number: " + i);
            }
        }
    }
    public static void main(String[] args) {
        EvenOddNUmber(5,10);
    }
}
