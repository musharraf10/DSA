public class StringLengthRecursive {
    public static int lengthOfString(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            return 1 + lengthOfString(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        int length = lengthOfString(str);
        System.out.println("Length of the string: " + length);
    }
}