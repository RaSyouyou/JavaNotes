package Java04ControlStatement;

public class While {
	/*
	 * while(boolean){        如果boolean 是真则一直输出
	 * 
	 * java 
	 * 
	 * }*/
    public static void main(String[] args) {
    	int i =0;
    	while(i<10) {
    		System.out.println(i);
    		i++;
    	}
    	System.out.println(i);
   
    /*
     * do...while....
     *    do{
     *       java
     *    }while(boolean);
     * 
     * */	
    	
    	int x =0;
    	do {
    		x++;
    		System.out.println(x);
    		
    	}while(x<10);
    	
    	
    	
    }
}

