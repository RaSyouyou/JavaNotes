package Java08ClassInheritence;


//MyDate 除了继承Time之外 也间接继承Object
public class MyDate extends Time {  //所以MyDate也继承Time继承的Object
	
	public static void main(String[] args) {
		
		Time t = new Time();  //toString()可以说是Time或者 任何类中的一个成员方法 需要调用需要先创建对象
		String s = t.toString();   //因为MyDate继承Time  且Time 继承Object 
		System.out.println(s);        
		
		MyDate t1 = new MyDate();
		String s1 = t1.toString();
		System.out.println(s1);
		
		Object t2 = new Object();
		String s2 = t2.toString();
		System.out.println(s1);
		
	}

}
