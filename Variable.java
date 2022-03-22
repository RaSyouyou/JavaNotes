package Java01variables;

/*
变量
1.java中如何定义变量，语法
    数据类型 变量名;

2.如何赋值；
     变量名= 值;

*/
public class Variable{
    public static void main(String[] args){
        int a;
	    a = 10;//在内存空间中开辟一块空间，这块空间的类型是整数型，给这块空间起名叫a        
	    System.out.println(a);

	    //重复访问
	    System.out.println(a);
    }
}


class Variable2{
    public static void main(String[] args){
        int i = 10;
        System.out.println(i);
	    i = 100;//重新赋值
	    System.out.println(i);//在同一个域中变量可以重新复制 但不能重复声明 在空一个域中 变量名不能重复
                          //java 语言中的变量必须先声明 再赋值 次啊能使用
	    int i1,i2,i3 = 365;   //三个变量只有i3被赋值 i1 i2 都没被初始化

	    int a1;
	    int a2;
	    int a3;
        a1 = 365;
        a2 = 365;
        a3 = 365;
	    System.out.println(i3);
	    System.out.println(a1);
	    System.out.println(a2);
	    System.out.println(a3);
	    
	    
        }


}