package classAndObj.homwWork;

public class magicCalculator extends Calculator {
	
	public static double root(int a) {
		return Math.sqrt(a);
	}
	
	public static double Sin(int a) {
		return Math.sin(a);
	}
	
	public static double Cos(int a) {
		return Math.cos(a);
	}
	
	public static double Tangent(int a) {
		return Math.tan(a);
	}
	
	public static int factorial(int a) {
		
		//using recursion to find a factorial
		if(a == 1) {
		return 1;
		} else {
			return a*factorial(a-1);
		}
		
	}
	

}
