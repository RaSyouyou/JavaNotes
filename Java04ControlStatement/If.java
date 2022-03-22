package Java04ControlStatement;

/*
 * 1 if(boolean){}
 * 
 * 2 if(boolean){
 * }else if(boolean){
 * }else
 * 
 * */
public class If {
    public static void main(String[] args) {
    	
    	boolean isSuccess = true;
    	
    	if(isSuccess) {
    		System.out.println("login success");
    	}else {
    		System.out.println("login failed");
    	}
    	
    	
     //练习 系统给定年龄1-100
     //根据年龄判断判断生命阶段1-5 幼儿     6-18 少年   19-35 青年 36-55 中年 55-100 老年
     String stage = "老年";
     int age = 110;
     if(age<= 5 && age>=1) {
    	 stage = "幼儿"; 
     }else if(age>=6 && age <= 18) {
    	 stage = "少年";  
     }else if(age>=19 && age <= 35) {
    	 stage = "青年"; 
     }else if(age>=36 && age <= 55) {
    	 stage = "中年"; 
     }else if(age>=55 && age <= 100) {
       	 
     }else {
    	 stage = "去你妈的，请输入正确的年龄";
     }
     
     System.out.println(stage);
    
    
    
    
    }
   
   
}

