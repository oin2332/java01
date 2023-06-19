package javaTest;
import java.util.*;

public class Test3 {
	public static void main(String[] args) {
	    int arr[] = {3, 5, 2, 9, 8};
	    	// °á°ú : {9, 5, 2, 3, 8}
	
	    int maxindex=arr[0];
	for (int i=0; i<arr.length;i++){
		if(arr[maxindex]<arr[i]){
			maxindex = i;
		}			
	}
	int temp = 0;
	temp = arr[maxindex];
	arr[maxindex] = arr[0];
	arr[0] = temp;
	
	System.out.println(Arrays.toString(arr));
	

}

}
