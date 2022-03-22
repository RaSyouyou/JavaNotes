package Java09Polymorphism;

public class Person {
	/*//喂养
		public void feed(Dog d) {
		    d.eat();	
	    }
		
		//因为用户的业务改变了 所以软件要升级
		public void feed(Cat c) {
			c.eat();
		}//Person类型的扩展能力太差
	*/
	
	
	
	
	
	public void feed(Animal a) {     //此时 Cat Dog 都继承了Animal 类型 所以只需要向上转型即可
		
		a.eat();                   //比如带入Cat类型的xiaohu引用 代码就是 Animal a = xiaohu =new Cat();
		
	}//在编程是最好参数不要是具体类型 而是抽象（父类型）类型

	
}