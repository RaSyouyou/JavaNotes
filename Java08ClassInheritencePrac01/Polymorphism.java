package Java08ClassInheritencePrac01;

/*
 * java语言中的向上转型 向下转型
 * 
 * 1.向上转型（upcasting）子  转 父
 * 2.向下转型(downcasting)父 转 子
 * 
 * 注：两个类之间必须有继承关系
 *  向上转型又被称作 自动类型转换 比如 猫是动物   父类型引用指向子类型对象
 *  
 *  
 *  多态作用：
 *  项目的扩展能力增强
 *  
 *  
 *  
 * */
public class Polymorphism {

	
	public static void main(String[] args) {
	    //向上转型又被称作 自动类型转换 比如 猫是动物   父类型引用指向子类型对象
		Animal a1 = new Cat();  //父类行引用指向子类型对象
	    //程序在编译阶段只知道a1是一个Animal 类型程序在运行的时候堆中的实际对象是Cat类型
		//因为程序在变一阶段a1被编译器看作为a1类型
		//程序在变一阶段引用a1 绑定的是Animal 类中的eat方法（静态绑定）
        //程序时堆中的对象实际上是Cat类型而Cat已经重写了eat方法
		//所以程序运行时对象的绑定的方法是Cat中的eat方法（动态绑定）
		a1.eat();
	
	    //向下转型 强制类型转换 
		Animal a2 = new Cat();//向上转型
		
		//执行Cat 特有的move方法
		//a2.move(); 直接调用无法调用 因为编译阶段jvm没有发现move（）方法
		//强制类型转换
		
		//做强制类型转换 的时候 程序承载风险
		Cat c1  = (Cat)a2;
		c1.move();
		
	
		
		
		
		/*Animal a3 = new Dog();
		Cat c2 = (Cat)a3;//java.lang.ClassCastException: 
		                 //Java09类的继承03.Dog cannot be cast to Java09类的继承03.Cat
		                 //at Java09类的继承03.Polymorphism.main
		                  * 
		                  * 
		                  */
		
		//所以java引入了 instanceof
		/*
		 * 用法 
		 *    1 instanceof 运算符的运算姐锅 是boolean
		 *    2 （引用 instanceof 类型）   
		 *    
		 *    例如（a instanceof Cat）如果结果是true表示 a引用指向堆中的java对象是cat类型
		 * */
		
		Animal a3 = new Dog();
		
		if(a3 instanceof Cat) {
			
			Cat c2 = (Cat)a3;
			
		}
		
		
		
		
		
		
	}
	
}
