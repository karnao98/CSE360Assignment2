/*
 * Name: Keith Arnao
 * Class ID: 318
 * Assignment 2
 * Description: Creates Calculator object which can add, subtract, multiply, and divide
 */

package cse360assign2;

/* 
 * Calculator.java
 * Allows for addition, subtraction, multiplication, and division
 */
public class Calculator {

	private int total;	// running total
	public String history;	// new String concatenated to history each time a mathematical method is called
	
	public Calculator () {
		total = 0;
		history = "0";
	}
	
	// Returns current total
	public int getTotal () {
		return total;
	}
	
	// Add value to current total
	// Concatenate operation to history
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	// Subtract value from current total
	// Concatenate operation to history
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	// Multiply value by current total
	// Concatenate operation to history
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	// Divide current total by value
	// Concatenate operation to history
	public void divide (int value) {
		if (value != 0) {
			total /= value;
			history += " / " + value;
		}
		else
			total = 0;
	}
	
	// Return history, which is a String of each operation performed
	public String getHistory () {
		return (history);
	}
}
