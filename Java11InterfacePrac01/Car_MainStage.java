package Java11InterfacePrac01;
public class Car_MainStage {
    public static void main(String[] args) {
    	
    	//生产引擎
    	Engine e1 = new YAMAHA();//多态
    	
    	//生产汽车
    	Car c1 = new Car(e1);
        c1.testEngine();
        
        
        //换宏达
        c1.e = new HONDA();
        c1.testEngine();
        
    }
}
