package day6;

import java.util.Arrays;

public class ArrayMain  {
	public static void main(String[] args) {
		
		int array[] ={3,5,2,4,1};
		
		Array a = new Array();
		
		System.out.println(a.MaxSubMin(array));
		
		a.MaxChange(array);
		System.out.println(Arrays.toString(array));
		
		
		
	}

}

