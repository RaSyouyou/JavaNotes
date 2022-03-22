package Java07Keywords;

/*
 * static 关键字 
 * 1 static 修饰的变量叫做“静态变量”
 * 2 static 修饰的方法叫做“静态方法”
 * 3 static 还可以定义静态语句块
 * 
 * 以下例子演示 static 定义静态语句块
 * 
 *     static 静态语句块在类加载阶段执行，并且只执行一次 并且使自上而下的顺序执行
 * 
 * */
public class Static01 {

	static {
		
        System.out.println("1");
	
	}
	
    static {
		
        System.out.println("2");
	
	}
    
    static {
		
        System.out.println("3");
	
	}
	
    static {
	
        System.out.println("4");

    }
	
    //主方法 入口
    public static void main(String[] args) {
    	
    	System.out.println("main method is go");
    	
    	
    }
	
	
}


