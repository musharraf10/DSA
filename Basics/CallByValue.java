public class CallByValue {
    public static void modifyValue(int num) {
        num = num + 10; // Change is made to the local copy
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before method call: " + number);
        modifyValue(number);
        System.out.println("After method call: " + number);
    }
}