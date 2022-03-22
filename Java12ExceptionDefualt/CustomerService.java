package Java12ExceptionDefualt;

public class CustomerService {
    
	
	public void register(String name)throws IllegalNameException {
    	
    	if(name.length()<6) {
    		
    		//IllegalNameException e = new IllegalNameException("用户名长度不能少于6位");
    		
    		
    		throw new IllegalNameException("用户名长度不能少于6位");
    		
    	}
    	
    	System.out.println("注册成功");
    }
}
