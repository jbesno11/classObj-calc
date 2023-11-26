package classAndObj.homwWork;

public class Calculator {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int square(int a, int b) {
		int returnNum = a;
		for(int i = 0;i<b-1;i++) {
			returnNum *= a;
			
		}
		
		
		return returnNum;
	}
	

}
