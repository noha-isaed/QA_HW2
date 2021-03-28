package edu.ncsu.csc326.coffeemaker.test;

import org.junit.Assert;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class GetRecipe_RecipeBookTest {

	@Test
	public void testGetRecipes() throws RecipeException {
	
		Recipe [] recipeArray = new Recipe[4];
		RecipeBook recipeBook =  new RecipeBook() ;

		Recipe recipe1 =  new Recipe() ;
		recipe1.setName("Milkshake Chocolate");
		recipe1.setAmtChocolate("1.5");
		recipe1.setAmtCoffee("0.5");
		recipe1.setAmtMilk("2");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("15");
		
		recipeBook.addRecipe(recipe1);
		recipeArray[0] = recipe1;
		
		Recipe recipe2 =  new Recipe() ;
		recipe2.setName("Chocolate Cake");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("1");
		recipe2.setAmtMilk("3");
		recipe2.setAmtSugar("2");
		recipe2.setPrice("30");
		
		recipeBook.addRecipe(recipe2);
		recipeArray[1] = recipe2;
		

		Recipe [] expectedArray = recipeArray;
		
		Recipe [] actualdArray = recipeBook.getRecipes();
		
		Assert.assertArrayEquals( expectedArray, actualdArray );
	}

}
