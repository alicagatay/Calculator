//importing files required for scanner
import java.util.Scanner;

public class Calculator {

	public static void main(String[] calculator) {
		calculate();//using your calculate function
	}

	static void calculate() {// creating a calculate function
		/* 
		 variables 
	    */
		double num1;
		double num2;
		double cevap;
		
		Scanner scanner = new Scanner(System.in);//creating a new scanner
		System.out.println("Please start the application by writing start");
		String operation = scanner.nextLine();
		
		
		/* 
		 the main code for running the application 
	    */
		
		
		while (operation != "exit") {	
			System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
			System.out.print("Enter your operation: ");
			 operation = scanner.nextLine();
			switch (operation) {
			case "addition":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();

				System.out.print("Number 2: ");
				num2 = scanner.nextDouble();
				if (num1 % 1 == 0 && num2 % 1 == 0) {
					cevap = num1 + num2;
					System.out.println("Result: " + ((int) cevap));
				} else {
					cevap = num1 + num2;
					System.out.println("Result: " + (cevap));
				}
				System.out.print("Enter another operation: ");
				 operation = scanner.nextLine();
				break;

			case "subtraction":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();

				System.out.print("Number 2: ");
				num2 = scanner.nextDouble();
				if (num1 % 1 == 0 && num2 % 1 == 0) {
					cevap = num1 - num2;
					System.out.println("Result: " + ((int) cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				} else {
					cevap = num1 - num2;
					System.out.println("Result: " + (cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				}

				break;

			case "multiplication":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();

				System.out.print("Number 2: ");
				num2 = scanner.nextDouble();

				if (num1 % 1 == 0 && num2 % 1 == 0) {
					cevap = num1 * num2;
					System.out.println("Result: " + ((int) cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				} else {
					cevap = num1 * num2;
					System.out.println("Result: " + (cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				}
				break;

			case "division":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();

				System.out.print("Number 2: ");
				num2 = scanner.nextDouble();
				if (num1 % 1 == 0 && num2 % 1 == 0) {
					cevap = num1 / num2;
					System.out.println("Result: " + ((int) cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				} else {
					cevap = num1 / num2;
					System.out.println("Result: " + (cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				}
				break;

			case "taking the power":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();

				System.out.print("Enter the power of " + (int) num1 + ": ");
				num2 = scanner.nextDouble();
				if (num1 % 1 == 0 && num2 % 1 == 0) {
					cevap = Math.pow(num1, num2);
					System.out.println("Result: " + ((int) cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				} else {
					cevap = Math.pow(num1, num2);
					System.out.println("Result: " + (cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				}
				break;

			case "remainder":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();

				System.out.print("Number 2: ");
				num2 = scanner.nextDouble();
				if (num1 % 1 == 0 && num2 % 1 == 0) {
					cevap = num1 % num2;
					System.out.println("Result: " + ((int) cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				} else {
					cevap = num1 % num2;
					System.out.println("Result: " + (cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				}
				break;

			case "taking square root":
				System.out.print("Number 1: ");
				num1 = scanner.nextDouble();
				cevap = Math.sqrt(num1);
				if (cevap % 1 == 0) {
					System.out.println("Result: " + ((int) cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				} else {
					System.out.println("Result: " + (cevap));
					System.out.println("Enter another operation: ");
					System.out.println("List of operations: addition, subtraction, division, multiplication, taking the power, remainder, taking square root.");
				}
			}
		}
		
	}
}
