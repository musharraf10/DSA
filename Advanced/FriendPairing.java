public class FriendPairing {
        public static int pairWays(int n){
            if(n==1 || n==2){
                return n;
            }
            //single
            int fnm1 = TailingProblem(n-1);
            //pair
            int fnm2 = TailingProblem(n-2);
            int pairWays = (n-1) * fnm2;
            int totWays = fnm1+pairWays;
            return totWays;
        }
    
        public static void main(String[] args) {
            System.out.println(pairWays(6));
        }
    }
