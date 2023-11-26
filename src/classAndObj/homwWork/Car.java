package classAndObj.homwWork;

public class Car {
	private String make, model, color;
	private int year;
	private boolean isOn;
	
	public Car(){
		this.make = null;
		this.model = null;
		this.color = null;
		this.year = 0;
		this.isOn = false;
	}
	
	public Car(String make, String model, String color, int year){
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.isOn = false;
	}
	
	
	public Car(String make, String model, String color, int year, boolean isOn){
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.isOn = isOn;
	}

	
	//getters 
	
	public String getMake() {
		return make;
		
	}
	
	public int getYear() {
		return year;
	}

	
	public String getModel() {
		return model;
	}

	

	public String getColor() {
		return color;
	}

	public boolean isOn() {
		return isOn;
	}
	
	
	//setters
	
	public void setColor(String color) {
		this.color = color;
	}


	
	public void setYear(int year) {
		this.year = year;
	}
	

	public void setOn() {
		if(!isOn) {
			this.isOn = true;	
			System.out.println("the car is now on");
		} else {
			System.out.println("The car is already on");
			
		}
	}
	
	public void setOff() {
		if(isOn) {	
		this.isOn = false;
		System.out.println("The car is now Off");
		} else {
			System.out.println("The car is already off");
		}
	}
	
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	
	public String toString() {
		
		if(isOn) {
			return "this " + color + " " + year + " " + make +" " + model + " Is currentally running";			
		} else {
			return "this " + color + " " + year + " " + make +" " + model + " Is currentally off";
		}
		
		
		
		
	}
	
	
	
	
	
	

}
