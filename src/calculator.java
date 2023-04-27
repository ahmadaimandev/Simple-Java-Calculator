import java.util.Scanner;

public class calculator {
	
	public static void main(String [] args) {
		
		char operator;
		double num1,num2,num3,num4, total;
		
		//create a scanner class//
		
		Scanner input = new Scanner(System.in);
		
		//ask user to enter the operator//
		System.out.println("Please choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);
		
		//ask user to enter the number//
		System.out.println("Please enter the first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Please enter the second number: ");
		num1 = input.nextDouble();
		
	}
}