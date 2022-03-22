package Java04ControlStatement;

public class Break {
    public static void main(String[] args) {
    	
    	for(int i = 1 ; i<=10; i++) {
    		System.out.println(i);
    		
    		if(i==5) {
    			break;
    		}
    	}
    	System.out.println("循环1结束");
    	
    	
    	
    	for(int i = 1 ; i<=10; i++) {
    		System.out.println(i);
    		
    		if(i==5) {
    			continue;
    		}
    		System.out.println(i);//打印1-10每个数两次 
    		                      //因为continue会结束当前一次循环
    		                      //故唯独5只会打印上面一次print 
    		
    	}
    	System.out.println("循环2结束");
    	
    	
	
    	for(int i = 1 ; i<=10; i++) {
    		System.out.println(i);
    		
    		if(i==5) {
    			return;
    		}
    	}
    	System.out.println("这句话打印不出来");//因为有return;语句 所以结束了整个main方法 
    	
    	
    	
    	
    	
    	for(int i = 1; i<=10;i++) {
    		
    		System.out.println("因为上边有return语句 所以这个循环不执行");
    		
    	}
    }
}
