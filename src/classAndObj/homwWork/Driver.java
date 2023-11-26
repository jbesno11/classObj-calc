package classAndObj.homwWork;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pet nullPet = new Pet();
		Pet Marble = new Pet("Marble", "Michigan", "Dog" , 6);
		
		System.out.println(nullPet.toString());
		System.out.println(Marble.toString());
		
		System.out.println("");
		
		Car nullCar = new Car();
		Car focus = new Car("Ford", "Focus", "Gray", 2012);
		Car Edge = new Car("Ford", "Edge", "blue", 2018, true);
		
		System.out.println(nullCar.toString());
		System.out.println(focus.toString());
		System.out.println(Edge.toString());
		
		focus.setOn();
		
		
		System.out.println(focus.toString());
		
		
		System.out.println("");
		
		System.out.println("Calculator");
		
		System.out.println(Calculator.add(7,5));
		System.out.println(Calculator.subtract(7,5));
		System.out.println(Calculator.multiply(7,5));
		System.out.println(Calculator.divide(7,5));
		System.out.println(Calculator.square(2,5));
		
		
		
		
		System.out.println("");
		System.out.println("Magic calculator");
		System.out.println(magicCalculator.square(2,5));
		System.out.println(magicCalculator.root(36));
		System.out.println(magicCalculator.Sin(36));
		System.out.println(magicCalculator.Cos(36));
		System.out.println(magicCalculator.Tangent(36));
		
		System.out.println(magicCalculator.factorial(7));
		
		
		
		
		
		

	}

}
