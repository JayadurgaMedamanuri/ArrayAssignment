package com.arrays.assignment2;

public class SubSetOfArray {

	public static void main(String[] args) {
		 
		int arr[] = {10,9,8,7,6,5,4};
		int brr[] = {6,7,8,11};
		int flag=0;
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(brr[i]==arr[j] ){
					 flag = flag+1;
				}
			}
		}
		System.out.println(flag);
		if(flag==brr.length) {
			System.out.println("Brr is subset of arr ");
		}else {
			System.out.println("Brr is not subset of arr");
		}

	}

}
