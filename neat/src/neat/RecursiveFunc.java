package neat;

public class RecursiveFunc {

	public static void main(String[] args) {
		 int res=sell(5,10);
		 System.out.println(res);  
		 }
	
	public static  int sell(int start ,int end){
		if(end>start) {
			return end + sell(start,end-1);
			
		}
		else
				return end;
		
	}


}
