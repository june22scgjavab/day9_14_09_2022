package com.infosys.object.demo1;
/*The food objects are different!
The food objects are different!
1579572132
359023572
com.infosys.object.demo1.Food@5e265ba4
com.infosys.object.demo1.Food@156643d4

 * 
 * 
 */
public class Tester {

	public static void main(String[] args) {
		Food foodOne = new Food();
		foodOne.setFoodName("Sandwich");
		foodOne.setCuisine("Continental");
		foodOne.setFoodType("Veg");
		foodOne.setQuantityAvailable(200);
		foodOne.setUnitPrice(10);

		Food foodTwo = new Food();
		foodTwo.setFoodName("Sandwich");
		foodTwo.setCuisine("Continental");
		foodTwo.setFoodType("Veg");
		foodTwo.setQuantityAvailable(200);
		foodTwo.setUnitPrice(10);
		if (foodOne.equals(foodTwo)) {

			System.out.println("The food objects are same!");
		} else {
			System.out.println("The food objects are different!");
		}
		if (foodOne == foodTwo) {
			System.out.println("The food objects are same!");
		} else {
			System.out.println("The food objects are different!");
		}
		System.out.println(foodOne.hashCode());
		System.out.println(foodTwo.hashCode());
		System.out.println(foodOne.toString());
		System.out.println(foodTwo.toString());
	}
	  
	  
	
}