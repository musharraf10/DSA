public class PatternA {
        public static void main(String args[]) {
            int i = 0, j = 0;
            int c = 1;
            int n = 8;
            int m[][] = new int[n][n];
            
            while (i < n && j < n) {
                m[i][j] = j%2 != 0 ? c-- : c++;
                if (i == n - 1) { 
                    j++;
                    i = j; 
                    if (j % 2 == 0) {
                        c = m[j-1][j-1]+1;
                    } else {
                        c = c + n - j-1;
                    }
                } else {
                    i++;
                }
            }
            for (int k = 0; k < n; k++) {
                for (int q = 0; q <= k; q++) {
                    System.out.print(m[k][q] + "  ");
                }
                System.out.println();
            }
        }
    }
