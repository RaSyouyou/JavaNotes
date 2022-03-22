package Java06Object;

public class CustomerE {
    public static void main(String[] args) {
    	
    	//1 创建Customer类型的对象
    	
    	Customer cus = new Customer();
    	
    	
    	//2.赋值
    	
    	//cus.age = 20;//因为age属性没有任何限制，导致外部程序可以随意访问age，导致age不安全
    	             //所以在Customer类中 添加private CustomerE.java 无法访问 age
    	
    	
    	
    	cus.setAge(-10);//使用应用点的方式访问成员方法
    	
    	
    	
    	
    	//3.读取
    	
    	//System.out.println(cus.age);
    	int cus_age = cus.getAge();  //如果赋值失败输出默认值
    	
    	System.out.println(cus_age);
    }
}
