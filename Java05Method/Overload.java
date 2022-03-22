package Java05Method;

/*
 * 方法重载
 *   1在同一个类中
 *   2方法名相同
 *   3参数列表不同（类型不同 个数不同  序列不同）
 * public static int sumInt(int a  )
 *  static int sumInt(int b  )
 * 以上两个方法没有构成方法重载   编译无法通过
 * 方法重载还与方法的修饰符无关
 * 方法重载与方法的返回值无关
 * 
 * */
public class Overload {

	
	
	public static void main(String[] args) {
	
	//在类Compute里不使用方法重载 程序需要记忆三个不同的方法名
	System.out.println(Compute.sumInt(10,20));
	System.out.println(Compute.sumDouble(1.0,2.0));
	System.out.println(Compute.sumLong(100L,200L));
	System.out.println("===================分割线===================");
	System.out.println(Chongzai.sum(100L,200L));
	System.out.println(Chongzai.sum(10,20));
	System.out.println(Chongzai.sum(1.0,2.0));

	
	
	}


}



class Compute{
	
	public static int sumInt(int a , int b ) {
		
		return a+b;
		
	}
	
	
	public static double sumDouble(double a , double b) {
		
		return a+b;
	}
	
	
	public static long sumLong(long a , long b ) {
		
		
		return a+b;
		
	}
	
	
}


class Chongzai{
	
	public static int sum(int a , int b ) {
		
		return a+b;
		
	}
	
	
	public static double sum(double a , double b) {
		
		return a+b;
	}
	
	
	public static long sum(long a , long b ) {
		
		
		return a+b;
		
	}
	
	
}