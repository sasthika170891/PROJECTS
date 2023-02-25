package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {

	public static void main(String[] args) throws IOException {
		
		//File              : reach the path : path of the file as input
		//FileReader        : get that file  : pass file object as input
		//BufferedReader    : reads content  : pass filereader as input
		
		// java=> nonstatic 
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\Hridhya\\src\\filehandling\\hridhya.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		// br.readline=>  hello     line=hello   line!=null  print line     hello
		// br.readline=>  welcome   line=welcome line!=null  print welcome  welcome
		// br.readline=> bye        line=bye                 print bye      bye
		// br.readline =null        line=null    line!=null  null!=null .. loop terminates
		
	}
}
