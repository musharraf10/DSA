public class SpiralMatrix {
    public static void spiral(int mat[][]){
        int startRow = 0, startCol = 0 ;
        int endRow = mat.length-1, endCol = mat[0].length-1 ;
        while (startRow <= endRow && startCol <= endCol) {
            // Top 
            for(int i = startCol ; i <= endCol ; i++){
                System.out.print(mat[startRow][i] +" ");
            }
            System.out.println();
            // Right 
            for(int j = startCol ; j <= endCol ; j++){
                System.out.print(mat[j][endCol] +" ");
            }
            System.out.println();
            // Bottom
            for(int i = endCol-1 ; i >= startCol ; i--){
                System.out.print(mat[endRow][i] + " ");
            }
            System.out.println();
            // Left
            for(int j = endRow-1 ; j >= startRow+1 ; j--){
                System.out.print(mat[j][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println(); 
        
    }
    public static void main(String[] args) {
        // 1, 2, 3, 4
        // 5, 6, 7, 8
        // 9,10,11,12
        // 13,14,15,16
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(mat);
    }
}
