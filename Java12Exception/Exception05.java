package Java12Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;


public class Exception05 {

	 public static void main(String[] args){
	    	
	    	//创建文件输入流
		 
		try {
			FileInputStream fis = new FileInputStream("C:/a.txt");
	    	fis.read();
		} catch(FileNotFoundException e){
			
		}catch(IOException e) {
			
		}
	    	
	
	 
	 }
	
}
