package Java11Interface;


/*
 * 接口的作用 ；
 * 1可以使项目分层 所有层面向接口开发  开发效率提高了
 * 2是项目变得可插拔
 * */
public interface CustomerService {
    
	//定义一个退出系统的方法
	void logout();
	
}


class ServiceImp implements CustomerService{
	
	public void logout() {
		
	    System.out.println("已经成功退出该程序");
		
	}
	
}
