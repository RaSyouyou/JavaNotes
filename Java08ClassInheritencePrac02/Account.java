package Java08ClassInheritencePrac02;

public class Account {
    
	private String actno ;
    
	
	double balance ;
    
	
	
	Account(){}
	
	Account(String actno, double balance){
		
		this.actno = actno;
		this.balance = balance;
	
	}
	
	//setter 
	public void setActno(String actno) {
		
		this.actno = actno;
	
	}
	//getter
	public String getActno() {
		
		return this.actno = actno;
		
		
	}

	
	
	
}


