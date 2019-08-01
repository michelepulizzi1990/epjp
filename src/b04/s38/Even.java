package b04.s38;

public class Even {
	public static void main(String[] args) {
		int value = 12;
		if(value < 0) {
			System.out.println("negativo");
			
		}
		else if(value <= 100) {
			System.out.print("piccolo");
			
			if(value % 2 == 0) {
				System.out.println("pari");
			} else {
				System.out.println("dispari");
				
			}
		}
				if(value % 2== 0) {
					System.out.println("pari");
				} else {
					System.out.println("dispari");
				}
						
}			
				
}

/*
 * < 0 "negativo"
 * [0..100] "piccolo"
 *      --> pari o dispari
 * > 100 "grande"
 */

	
	
