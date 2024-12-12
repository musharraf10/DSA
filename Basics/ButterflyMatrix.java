public class ButterflyMatrix {

        public static void main(String[] args) {
            int n = 5;
            int size = 2 * n - 1; // Size of the matrix
            char[][] matrix = new char[size][size];
    
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = ' ';
                }
            }
    
            // Fill the matrix to form a butterfly pattern
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    matrix[i][j] = '*'; // Top-left wing
                    matrix[i][size - j - 1] = '*'; // Top-right wing
                    matrix[size - i - 1][j] = '*'; // Bottom-left wing
                    matrix[size - i - 1][size - j - 1] = '*'; // Bottom-right wing
                }
            }
    
            // Print the matrix
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
