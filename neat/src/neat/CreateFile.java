package neat;
import java.io.File;
import java.io.FileWriter;

public class CreateFile {

	public static void main(String[] args) {

		File f1=new File("E:\\NeewFile.txt");
		
		try {
			if(f1.createNewFile()) {
				System.out.println("File is created successfully "+ f1.getName());
			}
			else {
				System.out.println("File already exists");
			}
		}
		
		catch(Exception e){
			System.err.println("Unexcepted error");
			
		}

	
	}
		

	}


