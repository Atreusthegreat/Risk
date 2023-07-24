package Risk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DICEROLL {

	private int roll;
	private int[] diceArray;
	private Random die;
	
	public void Dice() {
		
	}
	
	/**
	 * @return an int array of values of 1 to 6 representing the dice. the 
	 * number of values in the array should be between 1 and 3, depending on how may
	 * dice the player roll
	 */
	public int[] roll(int numberOfDice) {
		
		diceArray = new int[numberOfDice];
		
		for(int i = 0; i < diceArray.length; i++) {
			die = new Random();
			roll = die.nextInt(5) + 1;
			diceArray[i] = roll;
		}
		
		Arrays.sort(diceArray);
		Collections.reverse(Arrays.asList(diceArray));
		
		return diceArray;
	}
	
}

