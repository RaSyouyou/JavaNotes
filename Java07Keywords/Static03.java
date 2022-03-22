package Java07Keywords;

/*
 * static 修饰的方法叫做静态方法
 *      一般情况下工具类中的方法大部分都是静态方法
 *      
 *      静态方法的好处在于不需要创建对象也能直接访问该方法
 * 
 * 
 * 
 * 
 * */

public class Static03 {
    int y;
    
    Static03(){}
    Static03(int y){
    	
    	this.y=y;
    	
    }
	//成员方法
	//成员方法必须是用 引用.
    public void m1() {}
	
    public int getY(int y) {
		
		
		return this.y = y;
		
    }
	
	
	//静态方法
	//可以使用 类名. 调用
	//静态方法中不能直接访问非静态数据
	//静态方法中不能使用this
	public static void m2() {
		
		int x =2;
		
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(x);
		
		
		Static03 Datay01 = new Static03() ;
		Static03 Datay02 = new Static03(4) ;
		Datay01.m1();
		m2();
		
		
		
		System.out.println(Datay01.getY(10));
		System.out.println(Datay02.y);
		
		//静态的方法按照正规方式访问 类名.
		//静态的方法也能用  引用.访问
		Datay01.m2();//因为jvm看到Datay01 是一个Static03这样一个引用类型 所以还是类名.
		             //看似是Datay01.m2();  其实是Static03.m2();
	
	}
}
