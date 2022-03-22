package Java05Method;

/*
 * 
 *       }
 *       
 * 三.方法的返回值类型可以是任何一种返回类型，若无返回值则回归类型为void
 *     若规定了返回值则需要在方法的最后return一个数据
 * 
 * 
 * */
public class ReturnData {
    public static void main(String[] args) {
    	
    ReturnData.add(4,5);//在方法中返回了值 
                        //中途的代码System.out.println("计算成功，结果为下");
	                    //成功运行 但是值本身需要一个变量
    
    
    
    int outcome = add(1,2);
    
    
    System.out.println(outcome);
    
    	
    	
    	
    }
    
    
    
    public static int add(int a , int b) {
    	
    	int c = a + b;
    	System.out.println("计算成功，结果为下");
    	
    	return c;//如break.java中的笔记所述return后不可以在写代码因为不会执行
    }
}
