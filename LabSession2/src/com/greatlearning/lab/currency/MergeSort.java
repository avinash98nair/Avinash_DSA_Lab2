package com.greatlearning.lab.currency;

public class MergeSort {
	public void mergeSort(int[] array) {
		int size = array.length;
		if(size<=1) {return;}
		int middle = size/2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[size-middle];
		int l=0, r=0;
		for(int i=0; i<size; i++) {
			if(i<middle) {
				leftArray[l] = array[i];
				l++;
			}
			else {
				rightArray[r] = array[i];
				r++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	public void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		int i=0, l=0, r=0;
		while(l<leftSize && r<rightSize) {
			if(leftArray[l]>rightArray[r]) {
				array[i] = leftArray[l];
				l++;
				i++;
			}
			else {
				array[i] = rightArray[r];
				r++;
				i++;
			}
		}
		while(l<leftSize) {
			array[i] = leftArray[l];
			l++;
			i++;
		}
		while(r<rightSize) {
			array[i] = rightArray[r];
			r++;
			i++;
		}
	}
}
