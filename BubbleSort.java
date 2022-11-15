package com.arrays.assignment2;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] =  {20,9,4,6,2,9,6,10};
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					 arr[j]=arr[j-1];
					 arr[j-1]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		

	}

}
