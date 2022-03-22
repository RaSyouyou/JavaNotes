package Java09Polymorphism;


public class Test {
    public static void main(String[] args) {
    	
    	//创建主人
    	Person zhangsan = new Person();	
    	//创建宠物
    	Dog wangcai = new Dog();
    	Cat xiaohu = new Cat();
    	
    	
    	//喂养宠物
    	zhangsan.feed(wangcai); // 相当于 Animal a = (wangcai) = new Dog()
    	zhangsan.feed(xiaohu);
    	
    }
}
