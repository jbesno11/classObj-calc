package classAndObj.homwWork;

public class Pet {
	
	//instance variables
	private String name, location, type;
	private int age;
	
	
	//empty constructor
	public Pet() {
		this.name = null;
		this.age = 0;
		this.location = null;
		this.type = null;
	}
	
	
	
	
	//all attributes
	public Pet(String name, String location, String type, int age) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	
	//getters

	public String getName() {
		return name;
	}
	
	
	public String getType() {
		return type;
	}


	public int getAge() {
		return age;
	}

	
	//setters

	public void setName(String name) {
		this.name = name;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString(){
		return "This " + type + " is named " + name + " and is " + age + " years old. " + name + " is from " + location + "!";
	}
	
	
	
	
	
	

}
