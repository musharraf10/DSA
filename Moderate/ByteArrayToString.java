public class ByteArrayToString {
    public static void main(String[] args) {
        byte[] byteArray = { 72, 101, 108, 108 }; // ASCII values for "Hello"
        String str = new String(byteArray);
        System.out.println("Converted String: " + str);
    }
}
