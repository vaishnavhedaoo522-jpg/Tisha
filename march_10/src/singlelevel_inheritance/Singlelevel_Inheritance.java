package singlelevel_inheritance;

public class Singlelevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_A M= new Class_A();
		M.home();
		M.Money();
		
		
		System.out.println("======================");
		
		Class_B S= new Class_B(); // Creating Object of Child Class
		S.home();                 // using superclass property
		S.Money();               // using superclass property
		S.Mobile();              // Using own Property
		S.Laptop();              // using own property
		
	}
	
	

}
