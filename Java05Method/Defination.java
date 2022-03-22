package Java05Method;

/*
 * 计算10 和 20 的和
 * 方法为了进行功能相同 数据不同的运算
 * 
 * 
 * 一.什么是方法
 *     方法为一段代码片段 该片段可以完成特定功能 且可以重复利用
 *     
 *     
 *  二.定义方法的语法 
 *   【方法的修饰符】  方法的回归类型  方法名（方法的形式参数）{
 *       
 *         java
 *       }
 *       
 * 三.方法的返回值类型可以是任何一种返回类型，若无返回值则回归类型为void
 *     若规定了返回值则需要在方法的最后return一个数据
 * 
 * 
 * */
public class Defination {
    public  static void main(String[] args) {
    //在main方法中对sumInt 方法进行调用，完成功能
    //在加油static 的方法， 调用的时候必须采用 类名.  的方式调用
    Defination.sumInt(10, 20);
    Defination.sumInt(30, 30);
    	sumInt(10,10);
    	
    	
    Defination.println("aaaaaaa");//该"aaaaaaaa" 为实际参数
    Defination.m2();
    }
	
    //定义方法完成两个整数的求和 
    
	public static void sumInt(int a, int b) { //public static 是可选项
		
		int c = a+ b;
		
		System.out.println(a +"+"+ b +"=" +c);
		Defination.m2();
	}
	
	
	
	
	public static void println(String msg) {
		System.out.println(msg);
	}
	
	
    public static void m2() {
    	System.out.println("啥都没有");
    }

}

	