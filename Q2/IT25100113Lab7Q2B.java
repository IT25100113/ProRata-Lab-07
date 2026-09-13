public class IT25100113Lab7Q2B {
    public static void main(String[] args) {
        // Display numbers 1-5 with corresponding stars
        for (int row = 1; row <= 5; row++) {
            // Print the number and dash
            System.out.print(row + " - ");
            
            // Print stars equal to the row number
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}