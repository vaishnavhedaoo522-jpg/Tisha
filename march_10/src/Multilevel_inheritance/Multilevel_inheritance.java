package Multilevel_inheritance;

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grandmother G= new Grandmother();
		G.keys();
		G.recipe();
		
		System.out.println("======================================");
		
		Mother M=new Mother();
		M.keys();
		M.recipe();
		M.home();
		M.money();
		
		System.out.println("===========================================");
		
		son S = new son();
		S.keys();
		S.recipe();
		S.home();
		S.Mobile();
		S.money();
		S.Laptop();
		

	}

}
