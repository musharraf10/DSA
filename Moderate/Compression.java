public class Compression {
    // aaabbcccdd a3b2c3d2
    public static String compress(String s){
        String newString = "";
        for(int i = 0; i < s.length(); i++){
            Integer count = 1;
            while (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                count++;
                i++;
            }
            newString += s.charAt(i);
            if(count > 1){
                newString += count.toString();
            }
        }
        return newString;
    }
    
    public static String SB_using(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            Integer count = 1;
            while (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbcdd";
        System.out.println(SB_using(s));
    }
}
