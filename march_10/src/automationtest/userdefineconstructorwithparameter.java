package automationtest;

public class userdefineconstructorwithparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userdefineconstructorwithparameter M =new userdefineconstructorwithparameter();
		M.addition();
		userdefineconstructorwithparameter M1 =new userdefineconstructorwithparameter(100);
		M1.addition();
		userdefineconstructorwithparameter M3 =new userdefineconstructorwithparameter(100,70);
		M3.addition();
		userdefineconstructorwithparameter M4 =new userdefineconstructorwithparameter(100,50,30);
		M4.addition();

	}
     
    int num1;
	int num2;
	int num3;
	
	
	public userdefineconstructorwithparameter() ///user defined consctructor without parameter
	{
		num1=10;
		num2=20;
		num3=30;
		
	}
	
	public userdefineconstructorwithparameter(int a) //user defined consctructor with parameter
	{
		num1=a;
	}
	
	public userdefineconstructorwithparameter(int a, int b) //user defined consctructor with parameter
	{
		num1=a;
		num2=b;
	}
	
	public userdefineconstructorwithparameter(int a, int b, int c) //user defined consctructor with parameter
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	
	public  void addition() {
		
		int sum =num1+num2+num3;
		System.out.println("addition is :"+sum);
		
	}
	
}
