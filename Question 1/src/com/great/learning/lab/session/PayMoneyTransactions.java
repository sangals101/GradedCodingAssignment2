/**
 * 
 */
package com.great.learning.lab.session;

import java.util.Scanner;

public class PayMoneyTransactions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Transaction Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of Array");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the number of Targets");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			int value = 0;
			int target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			int sumOfValues = 0;
			for (int i = 0; i < size; i++) {
				sumOfValues += arr[i];
				if (sumOfValues > target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					value = 1;
					break;
				}
			}
			if (value == 0) {
				System.out.println("Given target is not acheived");
			}
		}
	}
}
