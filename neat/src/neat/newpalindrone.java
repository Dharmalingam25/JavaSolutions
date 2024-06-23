package neat;

public class newpalindrone {
	
	
static void palindrone(int n){
		 int r=0,sum=0,temp=0;
		 temp=n;
		 while(n>0) {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
		 if(temp==sum) {
			 System.out.println("this is a palindrone");
			 
			 
		 }
		 else {
			 System.out.println("this is not a palindrone");
		 }
		 
		 
	 }

	public static void main(String[] args) {
		
		palindrone(787);


	}

}
