package Java07Keywords;

/*this可以用在成员方法中*/
public class This02 {

	public static void main(String[] args) {
		
		
		//创建对象
		Employee e1 = new Employee(83,"张三");
		
		System.out.println(e1.ename);
		
		e1.work();
		
		//创建对象
		Employee e2 = new Employee(89,"李四");
		
		System.out.println(e2.ename);
		
		e2.work();
	    
		e1.m1();
	       
	
	}
	
	
}



class Employee{
	
	//员工编号
	int enmub;
	//员工名
	String ename;
	
	//Constructor
	
	Employee(){}
	
	Employee(int _id , String _name){
		
		enmub = _id;
		
		ename = _name;
		
	}
	
	//提供一个员工工作的方法
	public void work() {
		
		System.out.println(ename + "在工作" );
		System.out.println(this.ename + "在工作" );//其实在主方法中已经访问了ename
		                                           //但是调用ename这个成员变量需要一个引用抓取地址
		                                           //所以这个this 指的就是当前对象，谁调用this就是谁
	                                               //故this.可以省略  
	}
	//成员方法m1 m2
	public void m1() {
		
		this.m2();
		m2();
		
	}
	
	public void m2() {
		
		System.out.println("member function‘m2’ is GO");
		
	}
	
	
	
	
}
