package Java06Object;

public class Customer {

	  //属性 
	  //成员变量  实例变量  非静态变量
	
	private int age; //添加private则不能被外部访问
	
	Customer(){}
	
	//对外提供两个方法访问该数据其中 赋值就叫set    读取就是get
	//
	public int getAge() {   //因为age是一个int类型数据 所以肯定返回一个int 
		                    //且不能加修饰符static 该方法 叫做成员方法 或者非静态方法
		                    //所有的成员方法必须使用“引用.”的方式访问
		return age ;       
	}
	
	
	
	
	
	
	public void setAge(int  _age) {
		if(_age<0 || _age>100) {
			System.out.println("！年龄不合法，无法赋值！");//使用方法添加安全控制
			return;
		}
		
		age = _age;
	    
	}
	
	public static void main(String[] args) {
		
		Customer t = new Customer();
		t.age =10;                           //private 不能被外部访问 但是当前类是可以访问的
		
		
	}

}

