package Java08ClassInheritencePrac01;


public class BenefitsOfPloy {
    public static void main(String[] args) {
    //1.创建主人
    	Person zhangsan = new Person();
    //2.创建宠物
    	Dog wangcai = new Dog();
    	Cat xiaohu = new Cat();
    //调用方法	
    	zhangsan.feed(wangcai);
    	zhangsan.feed(xiaohu);
    }   
}


class Person{
    
	//喂养
	public void feed(Dog d) {
	    d.eat();	
    }
	
	
	//因为用户的业务改变了 所以软件要升级
	public void feed(Cat c) {
		c.eat();
	}//Person类型的扩展能力太差
}