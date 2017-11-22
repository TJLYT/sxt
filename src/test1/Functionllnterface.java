package test1;

public class Functionllnterface {

	/*public static void main(String[] args) {
		
	}*/
	
	//确保只调用一个方法
	@FunctionalInterface
	public interface Integrable{
		
		double eval(double x);
		
	}
}
