package automationtest;

public class Practise {
	int Superglobal = 123;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte Smallnumber = 24;
		short shortnumber = 11;
		int integernumber = 123;
		float Decimalnumber = 12.45f;
		double decimalnumbe = 123.5;
		long longnumber = 100000L;
		char character = 'A';
		boolean result = true ;
		
		
		System.out.println("Small number is : "+Smallnumber);
		System.out.println("Shortnumber is : "+shortnumber);
        System.out.println("integer number is : "+integernumber);
        System.out.println("Decimal number is : "+Decimalnumber);
        System.out.println("Big decimal number is : "+decimalnumbe);
        System.out.println("Long number is : "+longnumber);
        System.out.println("identify charcter is : "+character);
        System.out.println("boolean result is : "+result);
		
        
        short tempreture = -19;
        System.out.println("Tempreture is : "+tempreture);
        
        float num1 = 12.33f;
        float num2 = 13.66F;
        
        System.out.println("NUM1 VALUE IS : "+num1);
        System.out.println("Num2 value is : "+num2);

        float A = num1 + num2;
        float B = num1 - num2;
        float C = num1 * num2;
        float D = num1 / num2;
        
        System.out.println("Sum is "+A);
        System.out.println("Substraction is "+B);
        System.out.println("multiplcation is  :"+C);
        System.out.println("DIVISION IS "+D);
	}

}
