package Test;

public class Test06 {
//	�迭���� �ߺ� ���� 
		// 30,20,60,0,25,20,60,0,10,30,
		// {0,10,20,25,30,60}�� �ǵ��� 
	
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
