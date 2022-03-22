package Java10AbstractClass;

/*
 * 1.定义抽象类
 * 在class前加一个 abstract
 * 
 * 
 * 2.虽然抽象类无法实例化 但是抽象类也有构造方法
 * 该构造方法 是给子类创建对象用的
 * 
 * 
 * 3.抽象类中可以定义抽象方法
 *  语法 在方法修饰符列表中添加abstract关键字 加上返回值类型  并且抽象方法以;结束
 *  并且抽象必须要在子类中实现抽象 或者 子类为抽象类 因为如果子类不是抽象类 则不可以写抽象方法
 *  
 * 4 抽象类不能被fianl修饰 抽象方法不能被final修饰
 * */
public abstract class Abstract {
    
	
	Abstract(){
		
		System.out.println("Abstract类的无参数构造方法启动");
	}
	
	
	public abstract void m1();
	
	public static void main(String[] args) {
		
		//Abstract a = new Abstract(); error  抽象类无法创建对象
	
		
	Abstract aa = new B();//父类型引用指向子类型对象 多态
	//Abstract aa = new Abstract();error 无法被实例化
			
		
	}
	
}



class B extends Abstract{
	
	B(){
		
		System.out.println("B类的无参数构造方法启动");
	}
	
	   public void m1() {
			
			System.out.println("抽象方法m1启动");
			
		}
    
}