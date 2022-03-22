package Java12Exception;

import java.io.*;
public class Exception04 {
    public static void main(String[] args) throws FileNotFoundException{
    	
    	m1();
    
    //使用throws 处理异常不是真正处理异常而是推卸责任
    }
    
    public static void m1()throws FileNotFoundException {
    	
    	m2();
    }
    
    public static void m2()throws FileNotFoundException {
    	
    	m3();
    }
    
    public static void m3()throws FileNotFoundException {
    	
    	new FileInputStream("c:/ab.txt");
    	
    }
    
}
