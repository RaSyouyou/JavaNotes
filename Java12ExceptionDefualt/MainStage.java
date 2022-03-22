package Java12ExceptionDefualt;

public class MainStage {
    public static void main(String[] args) {
    	//假如用户提供的用户名如下
    	String username001 = "jackMa";
    	
    	CustomerService cs = new CustomerService();
    	
    	try{
    		cs.register(username001);
    	}catch(IllegalNameException e){
    		System.out.println(e.getMessage());
    	}
    	
    }
}
