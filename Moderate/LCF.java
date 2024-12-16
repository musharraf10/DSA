import java.util.Scanner;

public class LCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int lcf = findLCF(num1, num2);
        
        System.out.println("The Lowest Common Factor of " + num1 + " and " + num2 + " is: " + lcf);
        
        scanner.close();
    }
    
    public static int findLCF(int a, int b) {
        int lcf = 1; // Start with 1 as LCF
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                lcf = i; // Update LCF if i divides both a and b
            }
        }
        return lcf;
    }
}