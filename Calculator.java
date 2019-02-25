/**
 * @author Ellen Kissler
 * Class ID 440
 * Description: This calculator will be able to add, subtract, multiply, 
 * divide, and return the history of all actions completed. 
 * @version 3.0
 * @date 2/25/19
 */
package cse360assign2;

public class Calculator {

	private int total = 0;
	private String history = "0 ";
	
	/**
	 * A constructor for the calculator class.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	/**
	 * This void method will return the total that has been calculated by the calculator. 
	 * @return	the number after all calculations have been completed
	 */
	public int getTotal () {
		return total;
	}
	
	/** 
	 * This void method will add the given input to the total. 
	 * It also updates the history string. 
	 * @param value 	the value to be added to the total
	 */
	public void add (int value) {
		total = total + value;
		history = history + "+ " + value + " ";
	}
	
	/**
	 * This void method will subtract the given input from the total. 
	 * It also updates the history string. 
	 * @param value 	the value to be subtracted from the total 
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + "- " + value + " ";
	}
	
	/**
	 * This void method will multiply the total by the given input.
	 * It also updates the history string. 
	 * @param value 	the value to multiply the total by
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + "* " + value + " ";
	}
	
	/**
	 * This void method will divide the total by the given input. 
	 * It also updates the history string.
	 * @param value		the value to divide the total by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {		
			total = total / value; 
		}
		history = history + "/ " + value + " ";
	}
	
	/** 
	 * This method will return the history of all calculations performed. 
	 * @return		the history of all calculations performed 
	 */
	public String getHistory () {
		return history;
	}
}