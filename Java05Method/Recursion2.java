package Java05Method;

public class Recursion2 {

	public static void main(String[] args) {
    	//不使用递归求N的阶乘
		
		int outcome=1;
		int fact=4;
	    for(int i=fact;i>=0;i--) {
	    	if(fact ==0) {
	    		
	    	}else {
	    	outcome *= i;
	    	} 	
	    
	    } 
	    
    
	    
	    System.out.println(fact+"的阶乘是"+outcome);
	    System.out.println("=================================================================");
    
	  //使用递归求N的阶乘
	   
	    
	   int retValue= factorial(12); 
	   
	   System.out.println("阶乘是"+retValue);
	   	
	}
	
    public static int factorial(int x) {
        
		
        if(x==0) {
			return 1;
		}else {
			return x*factorial(x-1);
		}

    }
}
