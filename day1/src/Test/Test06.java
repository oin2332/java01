package Test;

public class Test06 {
//	배열에서 중복 제거 
		// 30,20,60,0,25,20,60,0,10,30,
		// {0,10,20,25,30,60}이 되도록 
	
	public static void main(String[] args) {
		int arr[] = {30,20,60,0,25,20,60,0,10,30};
		for(int i = 0; i<arr.length; i++){
			int index = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					index = i;					
				}
			}
			
		}
		
		
		
		
		
		
	}//main
}//class
