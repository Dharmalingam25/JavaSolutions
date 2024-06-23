package neat;

import java.util.Scanner;

public class Amstrong {
	
	static boolean isamstrong(int n) {
		int sum=0,last=0,digit=0,temp;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=Math.pow(last, digit);
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}
		else
			return false;
			
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i =0;i<=n;i++) {
			if(isamstrong(i)) {
				System.out.print(i+",");
				
			}
			
		}


	}

}
