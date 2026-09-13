public class IT25100113Lab7Q2C {
    public static void main(String[] args) {
        // Display decreasing number pattern
        for (int row = 5; row >= 1; row--) {
            // Print the digit 'row' times
            for (int count = 1; count <= row; count++) {
                System.out.print(row);
            }
            // Move to next line
            System.out.println();
        }
    }
}