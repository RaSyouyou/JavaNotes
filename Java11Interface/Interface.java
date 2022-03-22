package Java11Interface;

/*接口也是一个引用类型可以看作是类
 * 
 * 【修饰符】interface (接口名){}
 * 接口中只能出现  
 * 1常量
 * 2抽象方法
 * 3接口其实是一个特殊的抽象类 接口是完全抽象的
 * 4接口中没有构造方法  接口也无法被实例化
 * 5接口和接口之间可以多继承
 * 6一个类可以时间多个接口
 * 7一个非抽象的类实现接口 需要姜接口中所有的方法 “实现”或者说是覆盖
 * */
public interface Interface {
   //常量（必须用public static final 修饰）
	public static final String DOTA= "DOTA";
	public static final double PI =3.1415926;
	
	byte Max_Value =  127;// public static final 可以省略 系统会固定给你捎上
	
	
	
	
	
	//抽象方法
	public abstract void m1();
	void m2() ;
	
	
}

interface B{
	void m1();
}

interface C{
	void m2();
}

interface D{
	void m3();
}

interface E extends B,C,D{
    void m4();	
}

//implements 是实现的意思  一个类继承接口时 使用implements 而不是extends
class MyClass implements B,C{
	public void m1() {}
	public void m2() {}
}

class F implements E{
	
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
}

