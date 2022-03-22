package Java00Fund;

/*
一个java源文件种可以定义多个class
并且一个class会生成一个.class文件

一个 .java源文件中可以没有public 的class

public 的class 的名字 必须和文件名保持一致

如果要定义public class 那么这个public 的class 只能有一个
*/

public class abcd{
   public static void main(String[] args){
	    System.out.println("main method abcd is go");
	}
}
class B{ 
	public static void main(String[] args){
	    System.out.println("main method B is go");
	}
}

class C{ 
	public static void main(String[] args){
	    System.out.println("main method C is go");
	}
}

class D{
	public static void main(String[] args){
	    System.out.println("main method D is go");
	}
}