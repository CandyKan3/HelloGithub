/*
 * Dev: Bryce Kane
 * Version 1.0 
 * 12/16/2018
 */
import java.util.*;
public class helloGithub {
//This program is designed to be a simple calculator for a user.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inp = 0;
		
		int a =0;
		int b = 0;
		while(inp !=6) {
			System.out.println("Welcome! \n Press 1 to Add \n Press 2 to Subract \n Press 3 to Multiply \n Press 4 to Divide \n Press 5 to Modularly Divide \n Press 6 to Exit!");
	 inp = input.nextInt();
	 
			switch(inp) {
			
			case 1: {
				System.out.println("Please enter an integer");
				 a = input.nextInt();
				System.out.println("Please enter a second integer");
				 b = input.nextInt();
				System.out.println(Add(a,b));
			}
			break;
			case 2: {
				System.out.println("Please enter an integer");
				 a = input.nextInt();
				System.out.println("Please enter a second integer");
				 b = input.nextInt();
				System.out.println(Subtract(a,b));
				
			}
			break; 
			case 3: {
				System.out.println("Please enter an integer");
				 a = input.nextInt();
				System.out.println("Please enter a second integer");
				 b = input.nextInt();
				System.out.println(Multiply(a,b));
				
			}
			break; 
			case 4:{
				System.out.println("Please enter a double");
				double c = input.nextDouble();
				System.out.println("Please enter a second double");
				double d = input.nextDouble();
				System.out.println(Divide(c,d));
				
			}
			break;
			case 5: {
				System.out.println("Please enter an integer");
				 a = input.nextInt();
				System.out.println("Please enter a second integer");
				 b = input.nextInt();
				System.out.println(Modular(a,b));
			}
			break;
			case 6:{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			break;
			default:{
				System.out.println("Error please enter a specified value!");
			}
			}
		}
		// TODO Auto-generated method stub

	}
	public static int Add(int a, int b) {
		return a+b;
	}
	public static int Subtract(int a, int b) {
		return a-b;
	}
	public static int Multiply(int a, int b) {
		return a*b;
	}
	public static double Divide(double a, double b) {
		return a/b;
	}
	public static int Modular(int a, int b) {
		return a%b;
	}

}
