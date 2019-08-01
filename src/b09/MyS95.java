package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyS95 {
	public static ArrayList<Integer> join(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		int i = 0;
		int j = 0;
		
		ArrayList<Integer> Join = new ArrayList<Integer>();
		
		while (i < a1.size() && j < a2.size()) {
			
			if (a1.get(i) < a2.get(j)) {
				Join.add(a1.get(i)) ;
				i++;
				
			}
			
			else {
				Join.add(a2.get(j));
				
			}
			
			return Join;
	
		
		

		
		
		
       
        
        
        
        
        
        
        
        
        
        
        
	
	}

	


		
	}



}



