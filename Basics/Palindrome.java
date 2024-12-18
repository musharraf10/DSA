import java.math.BigInteger;

public class Palindrome {
    public static boolean isPalindrom1(String s) {
        if (s.length() <= 1) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            int n = s.length() - 1;
            if (s.charAt(i) != s.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    static int reverse(int num, int rev) {
        if (num == 0)
            return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome3(int num) {
        return num == reverse(num, 0);
    }

    public static boolean isPalindrome4(int num) {
        String original = Integer.toString(num);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static boolean isPalindrome5(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static double avg(double a, double b, double c) {
        return ((a + b + c) / 3);
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrom1(s));
        BigInteger result = factorial(79);
        System.out.println(avg(6.0, 6.0, 6.0));
        System.out.println(result);
    }
}
