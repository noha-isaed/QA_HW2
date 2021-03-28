package edu.ncsu.csc326.coffeemaker.test;


import org.junit.Assert;
import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class ToString_RecipeTest {

	@Test
	public void testToString() throws RecipeException , NumberFormatException{
		

		    Recipe rec = new Recipe() ;
		    rec.setAmtChocolate("2");
		    rec.setAmtCoffee("2");
		    rec.setAmtMilk("1");
		    rec.setAmtSugar("0.5");
		    rec.setName("Chocolate Cake");
		    rec.setPrice("10");
		    
		    double AmtChocolate = rec.getAmtChocolate();	
		    double AmtCoffee = rec.getAmtCoffee();
		    double AmtMilk = rec.getAmtMilk();
		    double AmtSugar = rec.getAmtSugar();
		    double Price = rec.getPrice();
		    String Name = rec.getName();
		    
	        String expected ="Coffee: "+AmtCoffee+",Milk: "+AmtMilk+",Sugar: "+AmtSugar+",Chocolate: "+AmtChocolate+",Price: "+Price+",Name: "+Name+"\n";
		    
		    String actual = rec.toString();
	    	
			Assert.assertEquals( expected, actual );
		
		
	}

}
