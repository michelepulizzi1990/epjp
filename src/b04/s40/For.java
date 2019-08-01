package b04.s40;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i array.length; i++) {
            System.out.println("Begin block loop " + i);

            if (i == 2) {
                continue;
            }

            System.out.println("End block loop " + i);
        
        
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = "" + 1;
        }
        
        for (String s : array) {
        	System.out.println(s + ": " + s.length());
        }
        
        System.out.println(">" + array[2] + "<");
    }  
}