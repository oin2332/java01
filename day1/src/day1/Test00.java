package day1;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 1, 3 };
		int sum = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println(max);
	
		
	}// main

}// class
