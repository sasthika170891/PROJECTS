package exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class thrws {
public static void main(String[] args) throws FileNotFoundException {
	File f= new File("C:\\Users\\hp\\eclipse-workspace\\Hridhya\\src\\filehandling\\hridhya.txt");
	FileReader fr= new FileReader(f);
	BufferedReader br= new BufferedReader(fr);
}
}
