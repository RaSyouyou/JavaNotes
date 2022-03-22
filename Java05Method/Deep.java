package Java05Method;

public class Deep {
    
	
	public static void main(String[] args) {
		
		int i = Deep.m1(true);
 	    System.out.println(i);
	    int x =Deep.m1_up(false);
	    System.out.println(x);
		
	    Deep.v(-3);
	    
	}
	
	
	
	public static int m1(boolean flag) {
		
		if(flag) {
			return 0;
		}else {
			return 1 ;
			
		}
	}
	
	
	public static int m1_up(boolean flag) {
		
		if(flag) {
			return 0;
		}
		
		return 1;//必须保证方法有返回值
	}
	
	
	
	public static void v(int i) {
		
		for (;i<10;i++) {
			
			if(i==5) {
				return;//结束所在的方法
			}
			
		System.out.println(i);
		}
		
	}
}

