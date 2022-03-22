package Java11InterfacePrac01;

public class Car {
    
	//生产汽车 
	//引擎
	Engine e;//面向接口编程
	//Constructor
	Car(Engine e){
		
		this.e =e;
	}
	
	public void testEngine() {
		
		this.e.start();
		
	}
}
