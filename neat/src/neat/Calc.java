package neat;

import java.util.Scanner;

public class Calc {
	public static void main (String[]arg) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers");
		double f=sc.nextDouble();
		double s=sc.nextDouble();
		System.out.println("Enter operator + , - , *, / ");
		char c=sc.next().charAt(0);
		double result;
		sc.close();
		
		switch(c) {
		case '+':
			result=f+s;
			break;
		case '-':
			result=f-s;
			break;
		case '*':
			result=f*s;
			break;
		case '/':
			result=f/s;
			break;
		default:
			System.out.println("error in input ");
			return;
		}
		System.out.println(result);
		
			
	}

}
