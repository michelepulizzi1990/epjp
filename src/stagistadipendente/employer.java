package stagistadipendente;

public class employer extends Person {
	
	protected static final double DEFAULT_SALARY = 0.0;
	
	private double salary;
	
	public employer(String name, double salary) {
		this (name, DEFAULT_SURNAME, salary);
	}
			
	public employer(String name, String surname, double salary) {
		super(name, surname);
		this.salary = salary; 
	}
	
	public double getsalary() {
		return salary;
}
	
	
}	
