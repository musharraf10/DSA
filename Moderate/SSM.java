public class SSM {
    // SEARCH IN SORTED MATRIX
    public static boolean stairCaseSearch(int mat[][],int key){
        int i = 0 , j = mat[0].length-1;
        // i = row and j = col
        while (i<mat.length && j >= 0) {
            if(mat[i][j] == key){
                System.out.println("key at "+i+","+j);
                return true;
            }
            else if(key < mat[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{10,20,30,40},
                       {50,60,70,80},
                       {90,91,92,93},
                       {94,95,96,97}};
        stairCaseSearch(mat, 0);
    }
}
