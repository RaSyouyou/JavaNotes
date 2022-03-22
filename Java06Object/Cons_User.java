package Java06Object;

public class Cons_User {
	
	
	
	String name;
	int age;
	static String school = "stfu";
    
	//定义构造方法
	Cons_User(){
		
		System.out.println("Cons_User的无参数构造方法执行！");
		
		//相当于 name = null; 附上默认值
		//      age =0 ;
		
	}
	
    public Cons_User(int age){   
		
		this.age = age;
		
	}
    
    
    Cons_User(String _name){
		
		name = _name;
		
	}
    
    
    Cons_User(String _name, int _age){
    	
    	age = _age;
    	name = _name;
    	
    	
    }
    
    public static void acc() {
    	
    	System.out.println("静态方法输出");
    	
    }
	
	
}