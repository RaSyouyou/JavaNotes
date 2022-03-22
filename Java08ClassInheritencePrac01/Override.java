package Java08ClassInheritencePrac01;

/*
 * 方法的覆盖
 * 1.如果父类中的方法无法满足子类的业务需求，就需要在子类重新写方法。
 * 
 * 2.一旦经过覆盖后 子类对象一定是调用覆盖后的方法
 * 
 * 3.什么时候会发生方法的覆盖------------   
 *   当满足一下所有条件是
 *   1）在两个具有继承关系的类之间
 *   2）具有相同的方法名
 *   3）具有相同的返回值类型
 *   4）具有相同的参数列表
 *   5）！重写的方法的权限不低于被重写的方法的权限！
 *   6）！重写的方法抛出的异常必须必须不宽于被重写的方法！
 *   7）该方法非私有
 *   8）该方法非构造方法
 *   9）该方法非静态。
 *   注：覆盖指的是成员方法 与成员变量无关
 *   
 * 4.故其最重要的作用是将方法重写
 *   
 * 
 * */
public class Override {
    
	public static void main(String[] args) {
		
		Gyro c = new Gyro();
		 
		c.move();
		
	}

	
}



class Aircraft {
	
	
	public void move() {
		
		System.out.println("飞行物在飞");     //父类方法不够用
		
	}
	
}



class Gyro extends Aircraft{
	//Cat 的move 方法应该输出    “猫在走猫步”
	//故Animal 的move 方法已经不够用了 所以要重新定义  
	//方法的重新定义就是方法的覆盖 方法的重写  方法的override
	
	
    public void move(){    //因为Animal 的方法 move 有修饰符public 所以 在Cat重写是必须在前加上 public
		
		System.out.println("直升机垂直方向飞");     //父类方法不够用
		
	}
	
}