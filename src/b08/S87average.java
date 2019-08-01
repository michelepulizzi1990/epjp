package b08;

import java.util.Scanner;

public class S87average {
	
    public static void average(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Please, enter some int numbers");
   
    	 while (scanner.hasNext()) { 
    		 scanner.hasNext();
    		 System.out.println("Enter at least one int number");
    	
    	 }
    	 
    	 int n = 0;
    	 int cont = 1;
    	 int sum = 0;
    	 double avarage = 0;
    	
    	 while (scanner.hasNext()) {
    		n = scanner.nextInt();
    		cont ++ ;
    		sum = sum + n; 
    	 
    	 }
    		
    	avarage = sum / cont ;
    	
    	System.out.println("La media dei valori interi è" + avarage );
	
    	
    	
    	
    	
    	
    	
    }
    }
    
