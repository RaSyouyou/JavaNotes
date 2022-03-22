package Java07Keywords;

/*
 * 1 this
 *    this是一个引用类型 保存了内存地址 
 *    在堆中的每一个java对象上都有this
 *    this保存内存地址指向自身
 *    
 *    
 * 2 this
 *    1）this可以用在成员方法中------->    1) 2)中使用可以分辨局部变量和成员变量
 *    2）this可以用在构造方法中------->    从而可以更好地规划参数列表
 *    3）可以通过this(实参)一个构造方法去调用另一个构造方法。
 * 
 * */

public class This01 {

	public static void main(String[] args) {
		
		MyDate t1 = new MyDate(2020,1,1);
		System.out.println(t1.year+"年"+t1.month+"月"+t1.day+"日");
		

		MyDate t2 = new MyDate(2020,11,11);
        System.out.println(t2.year+"年"+t2.month+"月"+t2.day+"日");

	   
		MyDate td = new MyDate();
        System.out.println(td.year+"年"+td.month+"月"+td.day+"日");
	    
	    
	
	}
	
}



class MyDate{
	
	int year;
	int month;
	int day;
	
	//Constructor
	//需求在拆功能键日期对象的时候 默认的日期是 1970-1-1
	MyDate(){
		/*
		this.year = 1970;
		this.month = 1;
		this.day =1;
        */
		this(1970,1,1);//this()语句必须出现在构造方法的第一行  可以代码重用比如简单地创建默认值
		
		
	}
	
	/*
	 * MyDate(int _year,int _month , int _day ){  不用this无法分辨局部变量和成员变量
		
		year = _year;
		month = _month;
		day = _day;
		
	}
	*/
	
	MyDate(int year,int month , int day ){
		
		this.year = year;
		this.month = month;
		this.day = day;
		
	}	
}
