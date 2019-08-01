package b04;

public class s46class {
	public static void main(String[] args) {
		StringBuilder mp = new StringBuilder();
		StringBuilder mp1 = new StringBuilder("baubau");
		StringBuilder mp2 = new StringBuilder("cane");
		
		System.out.println(mp.capacity());
		System.out.println(mp1.capacity());
		System.out.println(mp2.capacity());
		
		System.out.println(mp.append(' ').append("ciao"));
		
		System.out.println(mp1.charAt(2));
		
		System.out.println(mp2.delete(1, 2));
		
		System.out.println(mp1.indexOf("au"));
		
		System.out.println(mp2.insert(1, "oo"));
		
		System.out.println(mp1.length());
		
		System.out.println(mp2.replace(1, 5, "a a"));
		
		System.out.println(mp1.reverse());
		
		mp2.setCharAt(3, 'b');
        System.out.println("setCharAt: " + mp2);
        
        mp1.setLength(6);
        System.out.println("setLength: " + mp1);
        
        



		
		
}

	
}
