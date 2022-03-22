package Java08ClassInheritencePrac01;

public class PolyPrime {
    public static void main(String[] args) {
    	
    	Animal a1 = new Animal();
    	a1.eat();

    	Cat c1 = new Cat();
    	c1.eat();

    	Dog d1 = new Dog();
    	d1.eat();
       
    	PolyPrime p = new PolyPrime();
    	
    	p.feed(c1);
    	
    	
    	
    }
    
    public void feed(Cat c) {
    	
    	c.eat();
    	
    }
}


class Animal{
	
	public void eat() {
	    System.out.println("动物在吃");
	}
}


class Cat extends Animal{
	
	

	public void eat() {
	    System.out.println("猫吃鱼");
	}
	//Cat 特有的方法
	public void move() {
		System.out.println("猫在走猫步");
	}
	
	
}

class Dog extends Animal{
	
	

	public void eat() {
	    System.out.println("狗吃肉");
	}
	
	
}
