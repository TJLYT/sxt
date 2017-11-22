package test1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

public class infiniteStream2 {
	public static void main(String[] args) {
		System.out.println(queryFibonaciTest(10));
		  
	  }
	  private static List<Integer> queryFibonaciTest(int m) {
		Builder bd =IntStream.builder();
		int n1=1;
		int n2=2;
		int num=0;
		if(m==1) {
			bd.add(n1);
			return  bd.build().boxed().collect(Collectors.toList());
		}
		if(m==2) {
			bd.add(n1);
			bd.add(n2);
			return bd.build().boxed().collect(Collectors.toList());
		}
		bd.add(n1);
		bd.add(n2);
		 for (int j = 1; j < m; j++) {
	        	num = n1 + n2;
	        	n1 = n2;
	        	n2 = num;
	        	
	        	bd.add(num);
	        }

			IntStream stream = bd.build();
			return stream.boxed().collect(Collectors.toList());
		}
	}
