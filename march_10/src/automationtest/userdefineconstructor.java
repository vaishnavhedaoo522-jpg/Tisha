package automationtest;

public class userdefineconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		
		userdefineconstructor m = new userdefineconstructor();
		m.display1();
			
	

	}
	

	String City= "pune";
	
	String name;
	public userdefineconstructor()
	{
		name="it hub";
	}
	
	public static void display() {
		System.out.println("i am static method");
	}
	
	public void display1() {
		System.out.println("i am non-static method");
		System.out.println("my city name is "+City);
		System.out.println("my institute name is :"+name);
	}

}
