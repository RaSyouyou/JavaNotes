package Java07Keywords;

//super关键在用在构造方法中
//语法 super(实参) 作用为通过子类的构造方法执行父类的构造方法 
//语法规则 如果一个构造方法第一行如果没有 this（） 也没有super（）
//则系统会默认调用super（）
//super 并不能创建父类对象
public class Super02 {

	public static void main(String[] args) {
		
		DebitAccount da = new DebitAccount();// 执行DebitAccount的无参数构造方法 发现Account的无参数构造方法执行了
		DebitAccount da1 = new DebitAccount("李四",100000.0,100);
		System.out.println(da.getActno());
		System.out.println(da1.getActno());
		System.out.println(da1.getBlance());
		System.out.println(da1.getDebit());
		
		
	}
	 
}


class Account{
	private String actno;
	private double balance;
	
	public Account() {
		
      System.out.println("Account 的无参数构造方法执行");		
	 }
	
	public Account(String actno, double balance) {
		this.actno = actno;
		this.balance = balance;
	}
	
	  
	public void setActno(String actno) {
		this.actno = actno;
	}
	
	public String getActno() {
		
		return actno;
		
	
	}
	
	
	public void setBlance(double balance) {
		this.balance = balance;
		
	}
	
	public double getBlance() {
		
		return balance;
		
	}
	
	
}





class DebitAccount extends Account {
	
	//独特属性
	private double debit;
	
	public DebitAccount(){
		super();
	}
	public DebitAccount(String actno, double balance, double debit) {
		super(actno,balance);//如果有有参数的super（）则不会调用 可以穿透private
		this.debit = debit;  //通过子类的构造方法调用父类的构造方法 作用是给子类中的父类特性赋值
	}
	
	//set
	public void setDebit(double debit) {
		
		this.debit =  debit;
		
	}
	
	
  //get
	public double getDebit() {
		
		return this.debit;
	}
}