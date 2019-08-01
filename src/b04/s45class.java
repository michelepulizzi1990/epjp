package b04;

public class s45class {
    public static void main(String[] args) {
    	String a = "ciao";
    	String b = "buongiorno";
    	String c = "buonasera";
    	System.out.println("a, b, c: " + a + ", " + b + ", " + c);
    	 
    	System.out.println("char at position 1 in a: " + a.charAt(1));
    	 
    	System.out.println("a < b: " + a.compareTo(b));
        System.out.println("b > a: " + b.compareTo(a));
         
        System.out.println(a.concat(b));
         
        System.out.println(b.contains(c));
           
        System.out.println(c.equals(a));
        System.out.println(b.equals(a));

        System.out.println(a.indexOf('1'));
        System.out.println(a.lastIndexOf('l'));
        System.out.println(a.indexOf('x'));
        System.out.println(a.indexOf("ll"));
        System.out.println(a.indexOf("lx"));
        
        System.out.println(" + ".isEmpty());
        
        System.out.println(a.length());
        
        System.out.println(a.replace('c', 'o'));
        String[] splits = "one for me, one for you".split(" ");
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        
        String joined = String.join(" ", splits);
        System.out.println("Joining back [" + joined + "]");
        
        System.out.println("upper" + c.toLowerCase());
        System.out.println("lower" + b.toUpperCase());
        
        System.out.println("hey [" + " bum bum bum ".trim() + "]");
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
        











       
        










    }


}
