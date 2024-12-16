public class ExpandString {
    public static void main(String[] args) {
        String inputStr = "a3b5c2a12";
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < inputStr.length()) {
            char character = inputStr.charAt(i); // Get the letter
            i++;

            // Extract the number following the character
            StringBuilder numberStr = new StringBuilder();
            while (i < inputStr.length() && Character.isDigit(inputStr.charAt(i))) {
                numberStr.append(inputStr.charAt(i));
                i++;
            } 

            int count = Integer.parseInt(numberStr.toString()); // Convert number to integer

            // Append the character `count` times to the result
            for (int j = 0; j < count; j++) {
                result.append(character);
            }
        }

        // Print the final expanded string
        System.out.println(result.toString());
    }
}
