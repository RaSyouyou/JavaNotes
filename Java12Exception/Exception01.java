package Java12Exception;

/*
 *1异常是什么
 *    1）异常对应的是现实世界中的不正常的事件 
 *    2）java中采用类去模拟异常
 *    
 *2 异常机制的作用
 *
 * java语言为我们提供一种完善的异常处理机制
 * 作用是：程序发生异常事件之后 为我们输出了详细的信息 程序眼通过这个信息可以对程序进行处理 使得程序更加健全
 * */
public class Exception01 {
    public static void main(String[] args) {
    	/*
    	int a = 10;
    	int b = 0;
    	
    	int c = a/b;----->创建了 ArithMeticException e = 0x2356
    	
    	System.out.println("hello");//上面代码出现异常后 下面的的代码 jvm 没有执行
    	Exception in thread "main" java.lang.ArithmeticException: / by zero
    	at Java12异常.Exception01.main(Exception01.java:15)
        */
    	
    	
    	//以上程序编译通过了 但是发生了ArithmeticException异常 
    	//本质是 程序执行过程中 发生了算数异常事件 jvm 给我们创建了一个ArithmeticException类型的对象
    	//该对象包含了详细的异常信息 并且jvm将这个对象中的信息输出到控制台
        
    }
}
