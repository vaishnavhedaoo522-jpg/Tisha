package automationtest;

public class variabl1 {

	public static void main(String[] args) {
		
		//Syntax & Example:
		

		// TODO Auto-generated method stub
		
		byte smallNumber = 25;
        short shortNumber = 500;
        int integerNumber = 10000;
        long largeNumber = 100000000L;
        float decimalValue = 5.75f;
        double bigDecimalValue = 19.99;
        char letter = 'A';
        boolean isTrue = true;

        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + integerNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + decimalValue);
        System.out.println("Double: " + bigDecimalValue);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isTrue);
		 
		 
		 short temperature = -10;  // Example of short value

	        System.out.println("Temperature: " + temperature + "°C");
	        
	        
	        float num1 = 10.5f;   // Correct
	        float num2 = 3.14F;   // Correct (uppercase F is also valid)

	        System.out.println("Float Value 1: " + num1);
	        System.out.println("Float Value 2: " + num2);
	        
	        
	        //Example: Float Arithmetic Operations
	        
	        float num4 = 5.5f;
	        float num5 = 2.0f;

	        float sum = num4 + num5;
	        float difference = num4 - num5;
	        float product = num4 * num5;
	        float division = num4 / num5;

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Division: " + division);
	        
	        
	        
	        //Example: Using Float in an Array
	        
	        
	        float[] prices = {10.99f, 20.75f, 30.50f};

	        for (float price : prices) {
	            System.out.println("Price: " + price);
	       
		  
	        }
	        
	        
	        //Example: Converting an Integer to Float
	        int intValue = 100;
	        float floatValue = intValue;  // Implicit conversion

	        System.out.println("Integer: " + intValue);
	        System.out.println("Converted Float: " + floatValue);
		  
		  
		  

	}

}
 
 