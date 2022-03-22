package Java11Interface;

public class Service_MainStage {
	
	//执行ServiceImp中的logout方法
	public static void main(String[] args) {
		
	CustomerService cs =	new ServiceImp();
	
	cs.logout();
		
	}
	
}
