package b09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tabella {
	
	private ArrayList <Integer> tab = new ArrayList <Integer>() ;
	
	public void add(Integer a) {
		tab.add(a); }
	
	public boolean check (Integer a) {
		boolean checked = tab.contains(a);
		return checked ;	
	}
	
	public Collection <Integer> getData() {
		List <Integer> Tabsorted = new ArrayList <Integer>(tab) ;
		Tabsorted.sort(null);
		return Tabsorted ;
		
		
		
		
		
		 
		
		
		
		
		
		
	
	
	
	
	
		
	}
	
}
