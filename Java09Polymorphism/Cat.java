package Java09Polymorphism;



class Cat extends Animal{
	
	

	public void eat(){
	    System.out.println("猫吃鱼");
	}
	
	//Cat 特有的方法
	public void move() {
		System.out.println("猫在走猫步");
	}
	
	
}