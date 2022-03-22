package Java03Range;

/*
作用域

出了大括号就不认识了
*/
public class Range{
    static int m = 100;



    public static void main(String[] args){
        int k = 10;
	
    
        System.out.println(m);
	
	
	
	    int j;
	    for(j=0;j<10;j++){
	
		
	     	System.out.println(j);
    	}
	    System.out.println(j);
	
    }








    public static void m1(){
    
	    int k;//在不同方法中 可以重复定义k
	
	    int i = 101; 

	    k = i +20;
	    System.out.println(i);//可访问i 却不能访问k
    }
}