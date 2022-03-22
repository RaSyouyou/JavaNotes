package Java12ExceptionDefualt;


public class IllegalNameException extends Exception{

     //提供两个构造方法	
	public IllegalNameException(){}
	
	public IllegalNameException(String msg) {
		super(msg);
	}
	
}
