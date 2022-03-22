package Java12Exception;

/*
 * 
 * 
 * 
 * */
public class Exception02 {
    public static void main(String[] args){
        
    	int a = 10;
    	int b = 0;
    	
    	if (b!=0) {
    		int c = a/b;
    		System.out.println(c);
    	}else {
    		System.out.println("除数不能为0");
    	}
         
    
    }
}
