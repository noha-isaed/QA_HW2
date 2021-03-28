package edu.najah.csp.coffeemaker;


public class SoftawreTesting {
	public static void main(String[] args) {
		Object obj = new Object();
		
		Recipe rec = new Recipe();
		
		Recipe rec2 = new Recipe();

		
		System.out.println(obj.getClass());
		
		System.out.println(rec.getClass());
		
		if(rec.getClass() == rec2.getClass()) System.out.println("equals");

		if(rec.getClass() == obj.getClass()) System.out.println("equals");
		
		else System.out.println("not equals");

	}

}
