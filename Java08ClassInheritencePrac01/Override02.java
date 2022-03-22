package Java08ClassInheritencePrac01;

//父类
public class Override02 {
  public static void main(String[] args) {
     
  	Override02 o = new Test();  //多态
  	o.m1();//私有方法无法被覆盖
  	
      o.m2();//静态方法看的是类 而不是引用 所以静态方法不会被覆盖
      
      Test.m2();
  }
  
  private void m1() {//私有方法不会被覆盖

  	System.out.println("Override02 method m1 invoke");
     
  }
  
  public static void m2() {
  	
  	System.out.println("Override02 static  method m2 invoke");
      
  	
  }
  
}



//子类
class Test extends Override02{
	
	public void m1() {
		
		System.out.println("Test method m1 invoke");
	       
	}
	
	
  public static void m2() {
  	
  	System.out.println("Test static  method m2 invoke");
      
  	
  }
	
	
}