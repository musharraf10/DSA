public class FindSubsets {
    public static void FindSubset(String str,String ans, int i){
        if(i == str.length()){
            System.err.print(ans +" ");
            return;
        }
        //yes choice
        FindSubset(str, ans+str.charAt(i), i+1);
        //No choice
        FindSubset(str, ans, i+1);
    }
//---------------------------------------------------------------------
    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        // FindSubset(str, "", 0);
        findPermutation(str, "");
    }
}
