public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi
    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: Move one disk directly from source to destination
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top (n-1) disks from source to auxiliary, using destination as a helper
        solveTowerOfHanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move the remaining disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the (n-1) disks from auxiliary to destination, using source as a helper
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change this number to test with different disk counts

        // Call the method to solve Tower of Hanoi
        System.out.println("Steps to solve Tower of Hanoi for " + numberOfDisks + " disks:");
        solveTowerOfHanoi(numberOfDisks, 'A', 'B', 'C'); // A: source, B: auxiliary, C: destination
    }
}