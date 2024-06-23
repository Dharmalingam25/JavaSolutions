package neat;


interface ABC{
	void show();
	
	 static void display() {
		System.out.println("in display");
		
	}
}

class dot implements ABC{
	public void show() {
		System.out.println("In show");
	}
	
}
public class Impl {

	public static void main(String[] args) {

		ABC d=new dot();
		d.show();
	ABC.display();
		
	}

}
