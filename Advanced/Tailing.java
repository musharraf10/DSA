public class Tailing {
    public static int TailingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = TailingProblem(n-1);
        int fnm2 = TailingProblem(n-2);
        int totWays = fnm1+fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(TailingProblem(6));
    }
}
