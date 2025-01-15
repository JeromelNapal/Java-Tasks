public class Tasksheet114 {
    public static void main(String[] args) {
        int check_number = 10; // Initialize the variable
        String message; // Declare the message variable

        // Loop from 1 to check_number
        for (int i = 1; i <= check_number; i++) {
            // Check if the number is even or odd
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            // Print the message
            System.out.println(message);
        }
    }
}
