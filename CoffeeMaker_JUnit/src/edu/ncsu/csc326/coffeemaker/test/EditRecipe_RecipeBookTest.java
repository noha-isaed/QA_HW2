package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class EditRecipe_RecipeBookTest {

	@Test
	public void testEditRecipe1() throws RecipeException {
		
		//edit on exist recipe 
		
	    String expectedName = "Milkshake Chocolate";
		RecipeBook recipeBook =  new RecipeBook() ;

		Recipe recipe =  new Recipe() ;
		recipe.setName("Milkshake Chocolate");
		recipe.setAmtChocolate("1.5");
		recipe.setAmtCoffee("0.5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("1");
		recipe.setPrice("15");
		
		 recipeBook.addRecipe(recipe);
		 
		 Recipe recipe2 =  new Recipe() ;
		 recipe2.setName("Chocolate Cake");
	     recipe2.setAmtChocolate("2");
		 recipe2.setAmtCoffee("1");
		 recipe2.setAmtMilk("3");
		 recipe2.setAmtSugar("2");
		 recipe2.setPrice("30");
		 
		 String actualName = recipeBook.editRecipe(0, recipe2);
		
		assertTrue(actualName == expectedName);	

	}
	
	@Test
	public void testEditRecipe2() throws RecipeException {
		
		//edit on empty place
	    String expectedName = null;
		RecipeBook recipeBook =  new RecipeBook() ;

		 Recipe recipe2 =  new Recipe() ;
		 recipe2.setName("Chocolate Cake");
	     recipe2.setAmtChocolate("2");
		 recipe2.setAmtCoffee("1");
		 recipe2.setAmtMilk("3");
		 recipe2.setAmtSugar("2");
		 recipe2.setPrice("30");
		 
		 String actualName = recipeBook.editRecipe(3, recipe2);
		
		assertTrue(actualName == expectedName);	

	}
	
	@Test(expected =ArrayIndexOutOfBoundsException.class )
	public void testEditRecipe3() throws RecipeException {
		
		//edit on place out of range 
	    String expectedName = null;
		RecipeBook recipeBook =  new RecipeBook() ;

		 Recipe recipe2 =  new Recipe() ;
		 recipe2.setName("Chocolate Cake");
	     recipe2.setAmtChocolate("2");
		 recipe2.setAmtCoffee("1");
		 recipe2.setAmtMilk("3");
		 recipe2.setAmtSugar("2");
		 recipe2.setPrice("30");
		 
		 String actualName = recipeBook.editRecipe(5, recipe2);
		
		assertTrue(actualName == expectedName);	

	}

}
