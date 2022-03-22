package Java07Keywords;

public class Static02 {
	   
	/*
	 * 静态语句块只执行一次 只在类加载阶段执行
	 * 
	 * 实例语句块在构造方法执行之前执行
	 * 
	 * 比如该类在运行的时候 记录一次日志
	 * 
	 * */
	
	
	public static void main(String[] args) {
    	//调用构造方法
        new Static02();    	
        new Static02();    	
        new Static02();    	
    }
	
	
	
	static{
		System.out.println("A");
	}
	
	{
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	{
		System.out.println("3");
	}
	
	//构造方法
	Static02(){
		
		System.out.println("class无参数的构造方法执行");
	}
	
	
	
	
}
