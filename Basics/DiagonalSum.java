public class DiagonalSum {
    public static int Diagonal(int mat[][]){
        int sum = 0 ;
        for(int i=0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(i == j){
                    sum += mat[i][j];
                }
                else if(i + j == mat.length -1){
                    sum += mat[i][j];
                }
            }
        } //O(n^2)
        return sum;
    }
    public static int DiagonalOptimaized(int mat[][]){
        int sum = 0;
        for (int i = 0 ; i < mat.length ; i++){
            sum += mat[i][i];
            if(i != mat.length-i-1){
                sum += mat[i][mat.length-i-1];
            }
        } // O(n)
        return sum;
    }
    public static void main(String[] args) {
        // 1, 2, 3, 4
        // 5, 6, 7, 8
        // 9,10,11,12
        // 13,14,15,16
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(DiagonalOptimaized(mat));
    }
}


public class DiagonalSum {
    public static void main(String[] args) {
        int Array[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = 0;

        for (int i = 0; i <= Array.length-1; i++) {
            sum += Array[i][i];
            if (i != Array.length - 1 - i) {
                sum += Array[i][Array.length - 1 - i];
            }
        }
        System.out.println("Sum of diagonals: " + sum);
    }
}