package day3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		//creating url file
		URL resource = FileReaderDemo.class.getResource("MVIT_TNS.txt)");
		//show error if file not found
		if(resource == null) {
			System.err.println("File not found");
			//converting url int file object
			@SuppressWarnings({ "null"})
			File f = new File(resource.getFile());
			
			//object creation of file reader
			FileReader fr = new FileReader(f);
			
			//object creation for buffer reader
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			System.out.println(line);
		}
	}

}
