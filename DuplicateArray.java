package com.arrays.assignment2;

public class DuplicateArray {

	
	public static void main(String[] args) {
		int arr[] = {10,8,4,5,3,8,3,8,4,10,1,9};
		int duplicateValues;
		System.out.println("Duplicate values are :");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				
				if(arr[i]==arr[j]) {
					duplicateValues=arr[i];
					System.out.print(duplicateValues+" ");
				}
			}
			
			
		}

		
	}

}
