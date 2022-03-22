package Java06Object;

/*
 * 一.面向过程与面向对象的区别
 *  面向过程 ：必须了解整个过程 了解每个步骤之间的因果关系
 *  面向对象：将现实世界分割成不同单元 对于各个对象完成某个功能
 * 
 * 类 = 对象 + 方法
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

class Student{
	//属性
	//学号
	int id;//该变量不是局部变量 而是成员变量（没有static）故为非静态变量 
           //id是对象级别，必须先有对象才能访问  不能直接用类访问	
	
	//姓名
	String name;
	//性别
	boolean sex;
	//年龄
	int age;
	//住址
	String addr;
	
	boolean acdc;
	
}

public class Object {
	

    public static void main(String[] args) {
    	//1.创建对象
    	
    	Student stu1 = new Student(); //stu1是个局部变量 该变量的类型为Student引用类型
    	                              //new会在heap堆中开辟一个Student类型的对象的空间
    	                              //程序员无法直接操作堆中的数据 只能通过stu1这个引用保存的地址间接操作  
                                      //成员变量在堆中，成员变量如果没有默认值 则会有默认值
    	                              //成员变量不需要赋值就可以使用
    	
    	//一个类可以创建多个对象
    	
    	Student stu2 = new Student();
    	
    	//2.使用对象
    	//访问对象的属性时必须使用 "引用."
    	//2.1复制
    	stu1.acdc = true;
    	stu1.id = 001;
    	stu1.addr = "Tokyo";
    	stu1.age = 20;
    	stu1.sex = true;
    	stu1.name ="ctyzzz";
    	stu2.name ="fy";
    	
    	//对象的读取
    	System.out.println("still in college:"+stu1.acdc);
    	System.out.println("id:"+stu1.id);
    	System.out.println("name:"+stu1.name);
    	System.out.println("sex:"+stu1.sex);
    	System.out.println("age:"+stu1.age);
    	System.out.println("address:"+stu1.addr);
    	System.out.println("teammate:"+stu2.name);
    	
    	
    	
    }
}
