package com.grearlearning.lab.transaction;

public class Transaction {
	public int targetCheck(int[] transaction, int target) {
		int sum = 0;
		for(int i=0; i<transaction.length; i++) {
			sum += transaction[i];
			if(sum>=target) {
				return i;
			}
		}
		return -1;
	}
}
