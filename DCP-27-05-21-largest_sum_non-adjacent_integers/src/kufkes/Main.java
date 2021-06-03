// Author: Kevin Ufkes
// Date: May 31, 2021
// Project: Daily Coding Problem for May 27,2021
// Description (HARD):
//      This problem was asked by Airbnb.
//          Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
//          For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
//          Follow-up: Can you do this in O(N) time and constant space?

// Sample Arrays:
//		[6, 6, 6, 7, 6, 6, 6, 7, 6]
//		[3, 3, 3, 5, 3, 3, 3, 5]

package kufkes;

public class Main {

	public static int largestInArrayNo(int [] arr){
		int locLargest = 0;
		for(int x=0; x<arr.length; x++){
			if(arr[x]>arr[locLargest]){locLargest = x;}
		}

		int [] left;
		int leftLength = arr.length-(arr.length-locLargest+1);
		if(leftLength>1) {
			left = new int[leftLength];
			for (int y = 0; y < left.length; y++) {
				left[y] = arr[y];
			}
			System.out.println(printArray(left));
		}

		int [] right;
		int rightLength = arr.length-(locLargest+2);
		if(rightLength>1){
			right = new int[rightLength];
			for(int z=0; z<right.length; z++){right[z]=arr[z+locLargest+2];}
			System.out.println(printArray(right));
		}

//		return 666;
		return arr[locLargest] + largestInArrayNo(left) + largestInArrayNo(right);
	}

	public static int largestInArray(int []arr){
		int largest = arr[0];
		for(int x=0; x<arr.length; x++){
			if(arr[x]> largest){largest = arr[x];}
		}
		return largest;
	}

	public static int problemSolver(int [] arr){
		int sum;
		sum = largestInArray(arr);
		int [] left;
		int [] right;
//		right = new
		return sum;
	}

	public static String printArray(int [] arr){
		String s = "";
		for(int x=0; x<arr.length;x++){
			s += arr[x] + ", ";
		}
		return s;
	}

    public static void main(String[] args) {
	    int [] arr1 = new int [5];
	    int [] arr2 = new int [4];
	    int [] arr3 = new int [7];

		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 6;
		arr1[3] = 2;
		arr1[4] = 5;

		arr2[0] = 5;
		arr2[1] = 1;
		arr2[2] = 1;
		arr2[3] = 5;

		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 8;
		arr3[3] = 5;
		arr3[4] = 3;
		arr3[5] = 2;
		arr3[6] = 1;

		System.out.println(printArray(arr3));
		System.out.println("");

		System.out.println(largestInArray(arr3));
	}
}
