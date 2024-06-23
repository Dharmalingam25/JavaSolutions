package neat;

class Calcc
{
	int n;
	int m;
	int res;
	

 void perform(){
	 res=n+m;
	
}
}
public class object {

	public static void main(String[] args) {
		
		Calcc obj=new Calcc();
		obj.m=3;
		obj.n=5;
		obj.perform();
		System.out.println(obj.res);
		
				
				
				
		
	}

}
