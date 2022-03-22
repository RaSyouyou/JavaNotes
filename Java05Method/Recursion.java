package Java05Method;

/*
 * 
 * 一下程序应为递归没有结束的条件 所以 一直压栈没有弹栈导致内存溢出
public class recursion {
    public static void main(String[] args) {
    	
    	recursion.m1();        //该程序只有压栈的动作 最终导致栈的内存溢出
    	
    }
    
    public static void m1() {
    	
    	recursion.m1();
    	
    }
}
*/


public class Recursion {
    public static void main(String[] args) {
    	
    //1不使用递归求1-n的和
    	
    	int sum =0;
    	int n = 100;
    	for(int i=1;i<=n;i++) {
    		
    	sum = sum + i;
    		
    	}
    	System.out.println(sum);
    	
    	
   //2调用方法 
    	int outcome = Recursion.accu(100);
    	System.out.println(outcome);

    	
    	
    	
    	
    //3使用递归计算
    	
    	int acc = accu_r(2);
    	System.out.println(acc);
    }
    
   // 使用方法求和
    
    public static int accu(int n) {
    	
    	int sum = 0 ;
    	for(int i =1;i<=n;i++) {
    		
    		sum = sum + i;
    		 
    	}
    	
    	return sum;
    }
    
    //递归求和方法
    public static int accu_r(int x) {
      
    	int outcome;
    	if(x==0) {
    		return 0;
    	}else {
    	
         outcome =x+accu_r(x-1);
        
         return outcome;
    	}
    }
    	
    

}
