package test1;

import java.util.List;

public class functionallnterface {

	
	public interface Predicate<T>{
		boolean test(T t);
		
	}
	
	public static <T> List<T> findMatchPerson(List person,Predicate<T> predicate){
	
	for (Object T : person) {
		System.out.println(T);
	}
	
		return null;
	

	}
	
	

}
