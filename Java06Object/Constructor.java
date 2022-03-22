package Java06Object;

/*
 * 关于java类的构造函数
 * 
 * 1构造方法语法:
 *     【修饰符列表】  构造方法名（形式参数列表）{
 *     
 *     }     不能有返回值类型  
 *     
 *     
 * 2构造方法的方法名必须和类名一致
 * 
 * 
 * 3构造方法的作用：
 *    1）构造方法可以创建对象
 *    2）初始化成员变量
 * 
 * 4构造方法的调用：
 *   new 构造方法名（实参）;  在堆中开辟空间存储对象
 *   构造方法构成重载
 *   
 *   静态方法 类名.
 *   成员方法 引用.
 *   
 * 5如果一个类没有提供任何构造方法 系统默认提供无参数构造方法
 *  如果一个类已经手动提供了构造方法 那么系统不会再提供任何构造方法
 *   
 *   
 * 6成员变量只有在构造方法被调用的时候赋值
 * */
public class Constructor {
    public static void main(String[] args) {
    	
    	//创建Cons_User类型的对象
    	
    	Cons_User u1 = new Cons_User(); 	
    	Cons_User u2 = new Cons_User(20);
    	Cons_User u3 = new Cons_User("徐林森");
    	Cons_User u4 = new Cons_User("陈天宇",25);
    	
    	System.out.println(u3.name);
    	
    	u1.name = "张三";
    	
    	
    	
    	Cons_User.acc();
    	u1.acc();
    	System.out.println(u1.school);
    	System.out.println(u2.school);
    	
    	
    }
}

