package automationtest;

public class nonstaticvaribale {
   
	int V=120; // Non Static Global Variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticvaribale h =new nonstaticvaribale();
	    
		System.out.println("value of v is "+h.V);
		h.display();
		h.display1();

	}
	
	
	public void display() 
	{
		int b=30;  //local variable
		
		System.out.println("value of b is "+b);
		System.out.println("value of V is "+V);
			
	}
	
	public void display1()
	{
		int w = 40;
		int y = 70;
		
		System.out.println("Value of V is "+V);
		System.out.println("value of w is  "+w);
		System.out.println("value of y is  "+y);
	}

}
