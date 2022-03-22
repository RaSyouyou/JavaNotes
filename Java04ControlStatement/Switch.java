package Java04ControlStatement;

public class Switch {
	   
	public static void main(String[] args) {
    	int a  = 1000;
    	switch(a) {//switch 后面只能写int类型数据 与case进行匹配
    	case 1000:
    		System.out.println("程序编译成功");//若单个case没有break;则会穿透到一下的case 到break;为止
    	case 111:
    		System.out.println("！case穿透事件发生！");
    		break;
    		}
    		
    	
    	    System.out.println("");

    		System.out.println("===============char类型switch===============");

    		
    		System.out.println("");
        
    		
    		
        char c = 'C';//char类型可以直接转换成int类型所以int类型数据一样可以在switch括号中
        
        switch(c) {
        case 'A':
    		System.out.println("成绩为优秀");
    		break;
    		
        case 'B':
        	System.out.println("成绩为良好");
        	break;
        
        case 'C':
        	System.out.println("成绩为及格");
        	break;
        	
        case 'D': case'E':  case'F'://case可以合并
        	System.out.println("成绩为不及格");
        	break;
        	
        default:
        	System.out.println("成绩无效");
        	break;
        	
    
        }
        System.out.println("===============练习===============");
    	
        //练习 (不使用if)系统给定学生成绩 成绩分数，成绩可以带小数0-100 
        //编写程序根据学生的程序判断学生成绩等级
        //90-100 优秀 70-89良好  60-69及格 0-59不及格	
     double grade = 92.1;
     double Trans = grade/10;
     System.out.println(Trans);
     System.out.println((int)Trans);
     switch((int)Trans) {
     case 0: case 1: case 2: case 3: case 4: case 5:
      	System.out.println("成绩为不及格");
      	break;
     	
     case 6:
       	System.out.println("成绩为及格");
       	break;
       	
     case 7: case 8:
       	System.out.println("成绩为良好");
       	break;
       	
     case 9: case 10:
    	 System.out.println("成绩为优秀");
    	break; 
      
     default:
    	 System.out.println("成绩无效");
    	 break;
    	 
     }
     

     
     
	
	
	
	}
}

