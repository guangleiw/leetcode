package easy;

public class ReverseStrSolution {
	public String reverseString(String s) {

		long startTime=System.nanoTime();   //获取开始时间  	
		
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < sb.length() / 2; i++) {
			int swap_index = sb.length() - i - 1;
			if (sb.charAt(i) == sb.charAt(swap_index)) {
				continue;
			}
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(swap_index));
			sb.setCharAt(swap_index, temp);
		}
		
		long endTime=System.nanoTime(); //获取结束时间  
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");   	
		
		return sb.toString();
	}
	
	public String reverseStringWithStringBuilder(String s){
		long startTime = System.nanoTime();
		
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length()/2; i++) {
			int tail = sb.length() -i-1;
			if(sb.charAt(i) == sb.charAt(tail)){
				continue;
			}
			char temp  = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(tail));
			sb.setCharAt(tail, temp);
		}
		long endTime = System.nanoTime();
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		
		return sb.toString();
	}
	
}


/**
long startTime=System.nanoTime();   //获取开始时间  
doSomeThing();  //测试的代码段  
long endTime=System.nanoTime(); //获取结束时间  
System.out.println("程序运行时间： "+(endTime-startTime)+"ns");   
**/

/**
long startTime=System.currentTimeMillis();   //获取开始时间  
doSomeThing();  //测试的代码段  
long endTime=System.currentTimeMillis(); //获取结束时间  
System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
**/