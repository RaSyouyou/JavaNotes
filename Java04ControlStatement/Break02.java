package Java04ControlStatement;

public class Break02 {
    public static void main(String[] args) {
    	
    	for(int i = 5 ;i >0;i--) {
    		
    		
    		for(int j=0; j<i;j++) {
    			if(j == 2) {
    				break; //默认结束最近的循环
    			}
    			System.out.println(j);
    		}
    		
    	}
    	
    	
    	System.out.println("================================================");
    	
    	
    	
    	acdc:for(int i = 5 ;i >0;i--) {//可以给循环命名
    		
    		
    		for(int j=0; j<i;j++) {
    			if(j == 2) {
    				break acdc; //可以署名结束循环
    			}
    			System.out.println(j);
    		}
    		
    	}
    	
    	
    	
    }
}

