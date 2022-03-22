package Java01variables;

/*
变量根据出现为值可以分为两种
1. 局部变量  在方法体中声明的变量叫做局部变量 包括形式参数列表
2. 成员变脸  在类体中方法体之外声明的变量叫做成员变量
*/

public class VarType{
	//成员变量
	int i =10;
	int m ;  //成员变量如果没有手动赋值 系统会自动赋值
	public static void main(String[] args){
		//局部变量
		int k= 10;
		VarType v = new VarType();
		v.m2();

	}
	public void m2(){
	    System.out.println(m); 
		}
}