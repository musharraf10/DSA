import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate HCF
        int hcf = findHCF(num1, num2);

        // Output the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
        sc.close();
    }

    // Method to find HCF using the Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}