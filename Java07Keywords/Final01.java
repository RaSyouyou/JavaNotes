package Java07Keywords;

/*
 * final 修饰的类无法被继承
 * 
 * */
public final class Final01 {
    public static void main(String[] args) {
    	
    	MyMath p = new MyMath();
    	p.var = 10;
    	//p.PI = 100; 被final修饰后PI的值无法被重新赋予
    	System.out.println(p.PI);
    	System.out.println(MyMath.PI);
    }
}


class A{
	
    static final int x = 100;//final 修饰的成员变量必须在类结束前手动初始化
                      //final 修饰后要直接赋值 所以没必要把他弄成成员变量 可以在前加一个static放在方法区里	
	public final void m1() {}
	
	public void m2() {
		
		final int  i; 
		
		i =100;
		//i = 12; final修饰的变量不可被重新赋值
	}
	
	
}


/*class B extends A{
	
	public void m1() {}   //被final 修饰的方法无法被覆盖
	
	
}*/

class MyMath{
	//java规范中所有的常量大写
	public static final double PI=3.1415926;
	public static double var=0;
	
}