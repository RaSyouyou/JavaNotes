package Java07Keywords;

//super不是引用类型 super中储存的不是内存地址 super指向的不是父类对象
//super代表的是当前子类对象中的父类特征

//什么时候是用super
//想在子类中调用父类数据可以用 super.调用
//如在子类和父类中都有name属性 则向在子类中访问父类属性则可以用super.来访问

//使用super 第一可以用在成员方法中
       // 第二可以用在构造方法中
       //第三 this 与super相同不能用在静态的上下文中
public class Super01 {
  
	public static void main(String[] args) {
		
		Mana m = new Mana();
	        	
	    m.m1();
	    m.work();
	}
	
}


class Emp{
	
	
	String name ="员工张三";
	
	public void work() {
		
		System.out.println("员工在工作");
		
	}
}


class Mana extends Emp{

	
	String name ="经理李四";
	
  public void work() {  //方法的覆盖
		
		System.out.println("经理在工作");
		
	}
	
	
	public void m1() {
	
		System.out.println(this.name);
	    System.out.println(name);  //相当于    System.out.println(this.name);    
	    System.out.println(super.name); //   
		  
		this.work();    //仍然调用的该类覆盖后的方法
		super.work();   //不调用覆盖后的方法，super给出命令调用父类的方法
	
	}
	
	
}





