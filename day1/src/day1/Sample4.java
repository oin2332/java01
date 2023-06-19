package day1;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 4, 1, 3 };
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
			System.out.println(min);
	}

}
