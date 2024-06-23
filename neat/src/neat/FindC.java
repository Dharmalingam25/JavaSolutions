package neat;

public class FindC {

	public static void main(String[] args) {
		
		String ch="rhcajn 4i 0f0U CF285420 EWFJAKO NFANJFNZM JMCNVW VJ4W CONDSC 4FWDWKF #%2E@$%@";
		count(ch);

	}


public static void count(String X) {
	
	char [] ch=X.toCharArray();
	
	int a=0,s=0,d=0,o=0;
	for(int i =0;i<ch.length;i++) {
		if(Character.isAlphabetic(ch[i])) {
		a++;
		}
		else if (Character.isSpaceChar(ch[i])) {
			s++;
			
		}
		
		else if (Character.isDigit(ch[i])) {
			d++;
		}
		
		else {
			o++;
		}
	}
	
	System.out.println("no of digit:"+ d);
	System.out.println("no of space:"+ s);
	System.out.println("no of alphabet:"+ a);
	System.out.println("no of others:"+ o);
}
}

