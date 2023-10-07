package com.greatlearning.lab.currency;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		MergeSort mergesort = new MergeSort();
		Currency currency = new Currency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		int size = sc.nextInt();
		int[] denomination = new int[size];
		System.out.println("Enter the currency denominations value: ");
		for(int i=0; i<size; i++) {
			denomination[i] = sc.nextInt();
		}
		mergesort.mergeSort(denomination);
		System.out.println("Enter the amount you want to pay");
		int payment = sc.nextInt();
		currency.currencyCount(denomination, payment);
		sc.close();
	}

}
