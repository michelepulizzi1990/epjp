package b06.s072;

public class Main {
	public static void main(String[] args) {
    	Dog[] dogs = {new Dog("Tom", 2.42), new Dog("Ciro", 3.10), new Dog("Totò", 4.25), new Dog("Fausto", 2.70)} ;
    	
    	
		
		
		
       
        for (Dog dog : dogs) {
        System.out.println(dog.toString());   
     }
        
        double sFastestDog = dogs[0].getSpeed() ;
	}
        
        
        

        
