package ex;

public class S56 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
        
    	StringBuilder sc = new StringBuilder(s) ;    	 
    	sc.reverse();
		return sc.toString(); 
    }

    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
    	
    	
        return true;
    }

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
        // TODO
        return "";
    }

    /**
     * Convert from binary to decimal
     * 
     * @param s a string that contains the binary representation of an integer
     * @return the converted integer
     */
    public static int bin2dec(String s) {
        // TODO
        return 0;
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        int[] result = new int[0];

        // TODO

        return result;
    }

    /**
     * Calculate the average
     * 
     * @param data
     * @return the average
     */
    public static double average(int[] data) {
        // TODO
    	int result = 0;
    	
    	for(int i = 0; i < data.length; i = i+1) {
    		result = result + data[1];	
    	}
    	
    	result = result / data.length;
    	
    	
        return result;
    }
    
    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
        // TODO
        return 0;
    }
}
