package Java07Keywords;

public class Final02 {
    public static void main(String[] args) {
    	
    	final Customer c = new Customer("张三",19);
    	//c = new Customer("李四",23);  error c 被final修饰
    	
    	c.name= "李四";//编译可以通过
    	
    	
    }
}


class Customer{
	
	String name;
	int age;
	
	Customer(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
}