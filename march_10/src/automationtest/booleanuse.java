package automationtest;

public class booleanuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean isJavaFun = true;
	        boolean isRainy = false;

	        System.out.println("Is Java fun? " + isJavaFun);
	        System.out.println("Is it rainy today? " + isRainy);
	        
	        
	        boolean isAdult = true;

	        if (isAdult) {
	            System.out.println("You are an adult.");
	        } else {
	            System.out.println("You are not an adult.");
	        }
	        
	        
	        boolean a = true;
	        boolean b = false;

	        System.out.println("a AND b: " + (a && b)); // false
	        System.out.println("a OR b: " + (a || b));  // true
	        System.out.println("NOT a: " + (!a));       // false
	        
	        
	        boolean keepRunning = true;
	        int count = 0;

	        while (keepRunning) {
	            System.out.println("Iteration: " + count);
	            count++;

	            if (count == 5) {
	                keepRunning = false; // Stop loop after 5 iterations
	                
	            }}
	}

}
