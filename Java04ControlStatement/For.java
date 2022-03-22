package Java04ControlStatement;

public class For {
    public static void main(String[] args) {
    	for(int i=0 ; i<10;i++){    //初始化表达式;boolean类型表达式;执行{}内容后执行第三个表达式
    		System.out.println("aaa");
    	}
    	
    	
    	
    	/*
    	 *for的嵌套使用 
    	 * */
    	
    	for(int i = 3; i>0;i--) {
    		for(int j=0;j<i;j++) {
    			System.out.println(j);
    		}
    	}
    	
		   System.out.println("=====================exercise=====================");

    	//练习 打印九九乘法表
    	
    	for(int x=1;x<10;x++) {
    	   for(int y=1;y<=x;y++) {
    		   System.out.print(x+" x "+y+" = "+x*y+"   ");
    		  
    	   }	
    	   System.out.println();
    	}
    	
		   System.out.println("=====================exercise=====================");
    	
		   System.out.println("");
		   
		   System.out.println("=====================exercise=====================");
		   
		   
		   //练习计算1-100之间整数的求和
		   int sum=0;
		   for(int i=1;i<=100;i++) {
			  
			   sum += i;
			  
		   }
		   System.out.println("求和的结果是"+sum);
		   
		   
		   
		   
		   
		   System.out.println("=====================exercise=====================");
		   
           System.out.println("");
		   
		   System.out.println("=====================exercise=====================");
		   
		   
		   //练习计算1-100之间所有奇数的求和
		   int count=0;
		   for(int i=1;i<=100;i++) {
			  if(i%2 != 0){
				  count += i;
			  }
			   
			  
		   }
		   System.out.println("求和的结果是"+count);
		   
		   
		   
		   
		   
		   System.out.println("=====================exercise=====================");


    }
}