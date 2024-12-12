import java.util.Scanner;
public class Prime {
    public static void Prime(int num){
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false; // Numbers less than 2 are not prime
        } else {
            
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true;
    }
    
    public static void Prime01(int num){
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    break;
                }
                if(i == (int)Math.sqrt(num))
                System.out.println(num + " is a prime number.");
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        Prime01(number);
        
        scanner.close();
    }
}


