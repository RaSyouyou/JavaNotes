package Java12Exception;

import java.io.*;
import java.io.FileNotFoundException;

public class Exception07 {
	    public static void main(String[] args) {
	    	
	    	try{
	    		FileInputStream fis = new FileInputStream("abc");
	            
	    		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
	    		
	    	}catch(FileNotFoundException e) {
	    		
	    		e.printStackTrace();
	    		
	    		System.out.println("读取文件不存在");
	    		System.out.println(e.getMessage());
	    	}
             
	    	System.out.println("ssssssssss");
	 }
}
	    	
