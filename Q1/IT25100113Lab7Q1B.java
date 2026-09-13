import java.util.Scanner;

public class IT25100113Lab7Q1B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	//getting inputs from studens
		for (int student = 1; student <= 3; student++) {
			System.out.println("Student "+ student);
			System.out.print("Enter marks: ");
		
			//Reading four marks in a single line
			double mark1 = scanner.nextDouble();
			double mark2 = scanner.nextDouble();
			double mark3 = scanner.nextDouble();
			double mark4 = scanner.nextDouble();
		
			//calculate average
			double average = (mark1 + mark2 + mark3 + mark4)/4.0;
		
			//giving grades on averages
			String grade;
			if (average >= 75 && average <= 100) {
				grade = "Distinction";	
			} else if (average >= 50 && average <= 74) {
				grade = "Credit";
			} else if (average >= 0 && average <= 49) {
				grade = "Fail";
			} else {
				grade = "Invalid marks";
			}
		
			//Dislpay results
			System.out.println("Average is : "+ average);
			System.out.println("Overall Grade is : "+ grade);
			System.out.println();
		
		}
	}	
	
	
}