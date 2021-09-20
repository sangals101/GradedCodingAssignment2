/**
 * 
 */
package com.great.learning.lab.session;

import java.util.Scanner;

/**
 * @author Shivam Sangal
 *
 */
public class CurrencyNotes {

	public void notescountImplementation(int notes[], int amount) {
		if(amount == 0)
		return; 
		int[] noteCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give the minimum number of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ':' + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "notes of denomination 0 are invalid");
		}
	}
}
