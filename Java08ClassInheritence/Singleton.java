package Java08ClassInheritence;

/*
单例模式
  是23中设计模式中最简单的一种设计模式 
  
  
为了保证java虚拟机中某一个类型的java对象永远只有一个 
从而节省内存的开销


单例模式分为 
饿汉式单例  
懒汉式单例： 用到对象的时候菜回创建

缺点在于
*/
public class Singleton {
	
	
	public static void main(String[] args) {
		

		//SingleTest s3 = new SingleTest();     SingleTest is not visible
		
		
		
		/*
		SingleTest s1 = new SingleTest();
		SingleTest s2 = new SingleTest();
		SingleTest s3 = new SingleTest();
		SingleTest s4 = new SingleTest();
      */		
		
		//==两边如果是基本数据类型则可以比较两个基本数据类型是否相等
		//==两边如果是引用数据类型 则比较的是内存地址
		
		
		/*System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		*/
		
//		System.out.println(SingleTest.s);
		SingleTest aa = new SingleTest(3);//如果构造方法没有私有化
		System.out.println(aa.x);
		
		SingleTest a1 = SingleTest.getInstance01(); //创建一个a1接受来自getInstance01这个方法创建的 SingleTest类型数据
		SingleTest a2 = SingleTest.getInstance01(); 
		System.out.println(a1  == a2);//如果使用普通成员方法可以创建对象
		                              //但是创建的引用 a1 a2  的地址是不同的
		SingleTest s1 = SingleTest.getInstance00();
		SingleTest s2 = SingleTest.getInstance00();
		SingleTest s3 = SingleTest.getInstance00();
		SingleTest s4 = SingleTest.getInstance00();
		System.out.println(s1  == s2);
		System.out.println(s2  == s3);
		System.out.println(s3  == s4);
		System.out.println(s4  == s1); //如此 创建的引用的地址全部都是一样的
		
		System.out.println(s1.x);
	
	}
	

}


class SingleTest{
	
 private static SingleTest s;  
 int x ;
	
	//将构造方法私有化，故无法使用构造函数初始化数据 
	
	private SingleTest(){}
	
	SingleTest(int x ){
		
		this.x = x;
	}
	

	
	
	public static SingleTest getInstance01() {   //通常可以用一个静态方法来访问private 
                                              //但是问题是调一次 new一次 这样得话创建出来的对象对应的引用的地址是不一样的
     SingleTest a = new SingleTest();         //创建一个SingleTest 类型的 a 然后返回这个a
     return a ;

}
	
	
	
	
	//可以对外提供一个公开获取SingleTest对象的方法(必须是static 因为构造方法已经私有化了)
 public static SingleTest getInstance00() {  //创建一个SingleTest 引用类型的返回值 
	 
 	
 	
 	if(s==null) {
 		s = new SingleTest();
 	}
 	return s;
 	
 }
 

}
