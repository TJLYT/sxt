package test1;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

import javax.swing.Box;

/*
 * feibo
 */
public class infiniteStream {
  public static void main(String[] args) {
	System.out.println(test(10));
	  
  }
 /* public static int test(int n) {
	if(n==1) {
		return 0;
	}
	 if(n==2) {
		 return 1;
	 }
	  
	return test(n-1)+test(n-2);
	  
  }
  */
  public static List<Integer> test(int n) {
	  int z=0;
	  int x=1;
	  int y=1;
	  
	 
	  
	  //构建一个build
	 Builder buil = IntStream.builder();
	 buil.add(x);
	 buil.add(y);
	 //因为一开始把这两个x,y放入z中，所以计数时会减2
	 for(int i=0;i<n-2;i++) {
		 z=x+y;
		 x=y;
		 y=z;
		 buil.add(z);
		
	 }
	 //把这个builder封装成流
	 IntStream build = buil.build();
		//一个Collector由四个功能一起工作，积累的作品成为一个可变的结果容器指定，和选择性的进行最后的变换结果。他们是:
		//一个新的容器（supplier()）创造的结果
		//将一个新的数据元素为一个容器（accumulator()）结果
		//结合两个结果容器为一（combiner()）
		//执行一个可选的最后变换在容器（finisher()）
	 return  build.boxed().collect(Collectors.toList());
	  
  }
  
}
