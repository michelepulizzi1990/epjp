package b07;

public class S75 {
    public void f() {
        try {
            g();
        } catch (Exception ex) {
            System.out.println("Exception caught");
        } finally {
            cleanup();
            
        }
    }
    
    class MyExcpetion extends Exception {
    	private static final long serialVersionUID = 1L;
    	
    	public MyException(String message) {
    		super(message);
    	}
    }
    
    int first(int[] values) throws MyException {
    	if(values == null || values.length == 0) {
//			throw new IllegalArgumentException("values should be not null nor empty")    		
    		throw new IllegalArgumentException("values should be not null nor empty");
    		
    	}
    	return values[0];
    }

    public void g() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
        
    }

    private void cleanup() {
        System.out.println("performing cleanup");
    }

    private boolean somethingUnexpected() {
        return true;
    }

    public static void main(String[] args) {
        S75 exceptional = new S75();
        exceptional.f();
        
        
        exceptional.first(null);
    
    }
}
