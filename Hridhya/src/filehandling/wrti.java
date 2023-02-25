package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class wrti {

	//create a file and write content into it
	public static void main(String[] args) throws IOException {
		
		
		//File             :  reach tht file   : pass path of the file 
		//FileWriter       :  fetch that file  : pass file object as input
		//BufferedWriter   :  write content    : pass file writer as object
		
		// java-> non static in nature
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\Hridhya\\src\\filehandling\\hridhya.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		bw.write("bye");
		bw.close();
	}
}
