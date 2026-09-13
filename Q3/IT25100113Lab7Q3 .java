import java.util.Scanner;

public class IT25100113Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of customers
        System.out.print("Enter total bill amount: ");
        double billAmount = scanner.nextDouble();
        
        System.out.print("Enter mode of payment (C for cash, O for other): ");
        char paymentMode = scanner.next().charAt(0);
        
        // payment method
        if (paymentMode != 'C' && paymentMode != 'c' && paymentMode != 'O' && paymentMode != 'o') {
            System.out.println("Payment Mode is Not Valid");
            scanner.close();
            return;
        }
        
        double discount = 0;
        double amountToPay = billAmount;
        
        // Calculating discount for cash payments
        if (paymentMode == 'C' || paymentMode == 'c') {
            discount = billAmount * 0.05; // 5% discount
            amountToPay = billAmount - discount;
            System.out.println("Discount is : " + discount);
        } else {
            System.out.println("No discount applicable");
        }
        
        System.out.println("Amount to be paid: " + amountToPay);
        
    }
}