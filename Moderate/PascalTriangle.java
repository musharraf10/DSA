import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    private static List<Integer> getRow(int row){
        List<Integer> result = new ArrayList<>();
        int number = 1;
        result.add(number);

        for(int i = 1; i < row; i++){
            number = number * (row - i);
            number /= i;
            result.add(number);
        }
        return result;
    }

    public static List<List<Integer>> getPascalTriangle(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            triangle.add(getRow(i + 1));
        }
        return triangle;
    }




    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter number of rows for Pascal's Triangle: ");
    //     int rows = scanner.nextInt();

    //     for (int i = 0; i < rows; i++) {
    //         // Print spaces to center-align the triangle
    //         for (int j = 0; j < rows - i; j++) {
    //             System.out.print(" ");
    //         }

    //         int number = 1;
    //         for (int j = 0; j <= i; j++) {
    //             System.out.print(number + " ");
    //             number = number * (i - j) / (j + 1); 
    //         }
    //         System.out.println();
            
    //     }
    //     scanner.close();
    // }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> PT = getPascalTriangle(rows);
        for (List<Integer> row : PT) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
