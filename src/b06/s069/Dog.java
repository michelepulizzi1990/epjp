package b06.s069;

public class Dog {
	private static final String DEFAULT_NAME = "???";
			
	private String name;
	
	public Dog() {
		this.name = DEFAULT_NAME;
	}
	
	public Dog(String name) {
		this.name = name;
		this.weight = DEFAULT_WEIGHT;
		
		
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	
	
	}
	
	 

	


