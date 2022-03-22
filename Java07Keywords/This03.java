package Java07Keywords;

/*
 * this 可以用来区分成员变量和局部变量
 * 
 * 
 * 
 * */

public class This03 {
      public static void main(String[] args) {
    	  
    	  Manager m1 = new Manager();
    	  m1.setName("ashina isin");
    	  Manager m2 = new Manager("sekiro");
    	 
    	  System.out.println(m1.getName());
    	  System.out.println(m2.getName());
    	  
      }
}



class Manager{
	
	//Field
	private String name;
	
	
	//Constructor
	Manager(){}
	Manager(String name){
		
		this.name = name;
	}
	
	//Method
	//成员方法
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	//成员方法
	public String getName() {
		
		return this.name;
		
	}
	
}