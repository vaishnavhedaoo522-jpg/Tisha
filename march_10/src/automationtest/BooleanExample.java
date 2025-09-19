package automationtest;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example: Boolean in Conditional Statements
		
		boolean isJavaFun = true;
        boolean isRainy = false;

        if (isJavaFun) {
            System.out.println("Java is fun to learn!");  // This will execute
        }

        if (isRainy) {
            System.out.println("Take an umbrella.");
        } else {
            System.out.println("It's a sunny day!");  // This will execute
        }
        
        
        
        
        //Example: Boolean with Comparisons
        int a = 10, b = 20;

        boolean isGreater = a > b;  // false
        boolean isEqual = a == b;   // false

        System.out.println("Is a greater than b? " + isGreater);
        System.out.println("Is a equal to b? " + isEqual);
        
        
      //  Example: Boolean with Logical Operators
        
        boolean hasPermission = true;
        boolean isAdmin = false;

        boolean canAccess = hasPermission && isAdmin;  // false
        boolean canView = hasPermission || isAdmin;    // true

        System.out.println("Can Access: " + canAccess);
        System.out.println("Can View: " + canView);
	}

}
