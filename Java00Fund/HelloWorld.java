package Java00Fund;

public class HelloWorld{
    public static void main(String[] args){
	    System.out.println("HelloWorld");
	}
}
/*
 1.在javac 后跟的是文件名，而java后跟的是类名
 2.java虚拟机jvm默认在当前路径下寻找文件
   若没有配classpath 则默认在当前路径下寻找文件
   若在换进变量种新建一个classpath的路径则jvm只
   会去该路径下寻找文件


  关于该程序：
      public 表示公开的
	  static 为静态
	  class 为定义一个类 后为一个类体 在类体种不能直接写java语句
	  HelloWorld 为类名

      public static void main(String[] args) 为一个方法
	  void 为返回值类型
	  
	  
	  
	  打开dos命令窗口，输入javac会出现 javac 不是内部或者外部命令

出现以上问题是因为 window操作系统无法找到javac 的命令文件

windows 操作系统搜索硬盘上的某个命令的规则：
    -首先会从当前目录下搜索
    -当前目录搜索不到的话，会从环境变量path指定的路径当中搜索某个命令
    -如果都搜索不到，则报错

解决方法：
  计算机  ➡ 属性➡  高级系统设置➡  环境变量➡系统变量➡编辑➡预览 加入C:\Program Files\Java\jdk-11.0.7\bin


    标识符：在文件中可以自己命名的地方都是标识符
	1.java 标识符的命名规则：
	a）标识符是由 数字 字母 下划线 美元符号 构成
	b）不能以数字开头
	
	2.关键字不可以作为标识符

	3.标识符区分大小写

	4.标识符理论上没有长度限制

*/