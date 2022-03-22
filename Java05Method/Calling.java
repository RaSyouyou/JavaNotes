package Java05Method;

public class Calling {

	public static void main(String[] a) {
		
		A.m1();//在不同的类中的方法的调用需要在方法名前写类的名字
		
		Calling.m2();
		m2();     //在当前类中的方法可以省去类名
		
		
		
	}
	
	
	public static void m2() {
		
		System.out.println("Class Calling Method A is go");
			
	
	}
	
}



class A{
	public static void m1() {
		
		System.out.println("Class A Method m1() is go");
		
		
	}
	
	
}