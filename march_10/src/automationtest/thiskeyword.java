package automationtest;

public class thiskeyword extends Practise{
	
	int a=90; //Non-static global variable
	int b=100; //Non-static global variable
	static int z=12; // Static global variable
	
	public static void main(String[] args) {
		thiskeyword V1= new thiskeyword();
		V1.display();
		System.out.println("value of a is "+V1.a);
		System.out.println("value of a is "+V1.b);
		System.out.println("Value of z is "+z);
		System.out.println("super global variable "+V1.Superglobal);
		
		
		
	}

	private void display() {
		
		int a=20;
		int b=50;
		int z=1200;
		System.out.println("method local variable a value is "+a);
		System.out.println("value of global variable a is "+this.a);
		System.out.println("method local variable b value is "+b);
		System.out.println("value of global variable b is "+this.b);
		System.out.println("method local variable z value is "+z);
		System.out.println("value of global variable b is "+this.z);
		System.out.println("value is "+super.Superglobal);
	}
	
}
