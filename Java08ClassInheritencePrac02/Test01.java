package Java08ClassInheritencePrac02;


public class Test01 {

	
	public static void main(String[] args) {
		//创建信用卡
		DebitAccount da = new DebitAccount();
		
		//无法直接访问
		
		//da.actno = 10;
		//System.out.println(actno);
		
		//赋值与间接访问
		da.setActno("陈天宇");      // DA 继承A的setActno 方法所以 DA类的对象的引用也可以调出A 的方法
		System.out.println(da.getActno());//
		
	}
	
}
