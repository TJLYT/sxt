package test1;

import java.nio.charset.MalformedInputException;

public class jifen {
	
	public static void main(String[] args) {
		System.out.println(integrate(x -> x * x, 10, 100, 1000));
		System.out.println(integrate(x -> x * x, 10, 100, 1000));
	}
public interface Integer{
	
	double ev1(double x);
}
public static double integrate(Integer func,double x1,double x2,int num) {
	if(num<1)num=1;
	double del=(x2 -x1)/num;
	double start =x1+del/2.0;
	double sum=0.0;
	for(int i=0;i<num;i++) {
		sum += del*func.ev1(start+del * i);
		

	}
	return sum;
}

}