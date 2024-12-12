public class Patterns {
    public static void Hollow(int r , int c){
        for (int i = 1; i <= r ; i++){
            for(int j = 1 ; j <= c ; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // * * * * 
    // *     *
    // *     *
    // * * * *

    public static void NumPyramid(int r){
        for(int i = 1 ; i <= r ; i++){
            for(int j = 1 ; j <= r-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    public static void ZeroOneTriangle(int r){
        for(int i = 1 ; i<=r ; i++){
            for(int j =1 ; j<=i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print('1'+" ");
                }else{
                    System.out.print('0'+" ");
                }
            }
            System.out.println();
        }
    }
    // 1 
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void ZeroOneTriangle1(int r){
        for (int i = 1; i <= 5; i++) {
            int m = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(m + " ");
                m = 1 - m ;
            }
            System.out.println();
        }
    }

        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

    public static void Rhombus(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j<= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j < n ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //         * * * * 
    //       * * * * 
    //     * * * * 
    //   * * * * 
    // * * * * 

    public static void Diamond(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //           * 
    //         * * *
    //       * * * * *
    //     * * * * * * *
    //   * * * * * * * * *
   public static void Floyds(int n){
    int c = 1;
    for(int i = 1 ; i<=n ; i++){
        for(int j =1 ; j<=i ; j++){
            System.out.print(c+" ");
            c++;
        }
        System.out.println();
    }
   }
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15


    public static void CharPattern(int r, char ch){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println(); 
        }
    }
            // M 
            // N O
            // P Q R
            // S T U V
    public static void CharRest(int n){
        for (int i = 1; i <= n; i++) {
            char letter = 'A'; 
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++; 
            }
            System.out.println(); 
        }
    }
            // A 
            // A B 
            // A B C 
            // A B C D 

    public static void PyramidNumber(int r){
       int c = 0;
        for(int i = 1; i<=r ; i++){
            for(int j = 1 ; j <= r-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                if(i-j ==1)
                    c++;
                if(i-j == 0  || (i-j == 1 && c>=1)){
                    continue;
                }
                System.out.print(Math.abs(i-j)+" ");
            }
            System.out.println();
        }
    }
        //       1 
        //     2 1 2
        //   3 2 1 2 3
        // 4 3 2 1 2 3 4

    public static void PyramidNumber1(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
        //           1 
        //         2 1 2
        //       3 2 1 2 3
        //     4 3 2 1 2 3 4
        //   5 4 3 2 1 2 3 4 5 



        public static void HDiamond(int n){
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                 }
                 System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

                // * 
                // * *
                // * * *
                // * * * *
                // * * *
                // * *
                // *

    public static void NumRightTRIO(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j+i <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 
    
            //         1 
            //       1 2
            //     1 2 3
            //   1 2 3 4
            // 1 2 3 4 5



    public static void Butterfly(int n){
        
        // Upper half
            for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

                    // *        *
                    // **      **
                    // ***    ***
                    // ****  ****
                    // **********
                    // **********
                    // ****  ****
                    // ***    ***
                    // **      **
                    // *        *

    public static void X(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Check conditions for printing stars
                if (row - col == 0 || row + col == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        // *   *
        //  * *
        //   *
        //  * *
        // *   *
        

    public static void DiamondBorder(int rows){
        // Upper half
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
                //      *
                //     * *
                //    *   *
                //   *     *
                //    *   *
                //     * *
                //      *


    public static void NumberTriangle(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
        //      1
        //     121
        //    12321
        //   1234321
    public static void HollowSquareDiagonal(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        //    *     *
        //     *   *
        //      * *
        //       *
        //      * *
        //     *   *
        //    *     *  


    public static void printV(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                // Check conditions for printing stars
                if (col == row || col == 2 * n - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        // *         *
        //  *       *
        //   *     *
        //    *   *
        //     * *
        //      *

    public static void main(String[] args) {
        //NumberTriangle(4);
        //HollowSquareDiagonal(7);
        //printV(6);
    }
}
