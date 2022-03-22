package Java12Exception;


import java.io.*;

public class Exception06 {
    public static void main(String[] args) {
    	
    	try{
    		FileInputStream fis = new FileInputStream("abc");
            
    		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
    		fis.read();
    	}catch(FileNotFoundException e) {
    		System.out.println("读取文件不存在");
    	}catch(IOException e) {
    		System.out.println("其他异常发生");
    	}
       
    }
}
