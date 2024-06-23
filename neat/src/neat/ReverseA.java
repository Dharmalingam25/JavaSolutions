package neat;
import java.util.Scanner;
public class ReverseA {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		char [] let=sc.nextLine().toCharArray();
		for( int i=let.length-1;i>=0;i--) {
			System.out.println(let[i]);
			sc.close();
			
		}
		System.out.println("\n");
		

	}

}
