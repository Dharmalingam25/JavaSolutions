package neat;

public class fact {

	
	static void facts(int n) {
		
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	facts(5);	
	}

}
