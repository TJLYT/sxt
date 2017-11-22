package test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Hellop {
  public static void main(String[] args) {
	
	  Comparator<String> c1= String::compareTo;
	 String [] strs = {"bc","ad"};
	  
	 Arrays.sort(strs,c1);
	 System.out.println(strs);
	 for(String s : strs) {
		 System.out.println(s);
	 }
	  
}
}
