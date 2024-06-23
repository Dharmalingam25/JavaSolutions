package neat;

class Calccc{
	public double add(double ... n) {
		double sum=0;
		for ( double i : n) {
			sum=i+sum;
		}
		return sum;
	}
}

public class Varsagr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calccc obj=new Calccc();

System.out.println(obj.add(1,3,4,5.9));
	}

}
