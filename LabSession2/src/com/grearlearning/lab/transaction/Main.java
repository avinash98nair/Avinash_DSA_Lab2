package com.grearlearning.lab.transaction;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Transaction obj = new Transaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array: ");
		int size = sc.nextInt();
		int[] transaction = new int[size];
		System.out.println("Start entering the values of the transaction array: ");
		for(int i=0; i<size; i++) {
			transaction[i] = sc.nextInt();
		}
		System.out.println("Enter the number of targets to be achieved: ");
		int numberOfTargets = sc.nextInt();
		for(int i=0; i<numberOfTargets; i++) {
			System.out.println("Enter the value of the target: ");
			int target = sc.nextInt();
			int result = obj.targetCheck(transaction, target);
			if(result==-1) {
				System.out.println("Target not achieved");
			}
			else {
				System.out.println("Target achieved after "+(result+1)+" transactions");
			}
		}
		sc.close();
	}

}
