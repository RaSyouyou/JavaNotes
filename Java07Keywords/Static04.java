package Java07Keywords;

/*
 * static 修饰的变量叫做静态变量
 * 
 * 1.局部变量
 * 2.成员变量
 * 3.静态变量（方法区） 方法区储存常量 静态变量
 * 
 * 
 * 
 * 
 * */
public class Static04 {
 
	public static void main(String[] args) {
		
		Animal A1 = new Animal("cat",5);
		Animal A2 = new Animal("dog",3);
		Animal A3 = new Animal("elephant",5);
		System.out.println(A1.name);
		System.out.println(A2.age);
		System.out.println(A3.type);//A3的数据类型为Animal引用类型所以 还是相当与 Animal. type 和对象无关
		System.out.println(Animal.type);
		Animal.type = "水生";
		System.out.println(A2.type);
		
		
		
	}
	//静态变量属于成员变量  所以不能定义在方法当中
	/*public static void test() {
		
		static int a; 
		
	}*/
	
}
//抽象现实世界中的“陆生”动物

class Animal{
	//成员变量
	String name;
	int age;
	static String type = "陆生"; //如果定义成员变量太浪费空间  可以声明为静态变量算是类级别 
	                             //又 为static修饰符修饰的变量 故访问该变量需要类名.
	                             //在类加载是运算  只会运算一次  
	
	
	//Constructor
	
	Animal(){}
	
	Animal(String name, int age){
		
		this.name = name;
		this.age = age;
		
		
	}
}
