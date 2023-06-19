package Test;

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 {40, -20, -30, -10, 50}에서 가장 큰 수와
		// 가장 작은 수의 차이 구하기 
		// 단 음수는 절대 값
		//(ex, 가장 큰수 : 50, 가장 작은수 : -10,결과 40)
		
//		int max =0;
//		int min =0;
//		int arr[] = {40,-20,-30,-10,50};
//		for(int i=0; i<arr.length; i++){
//			for(int j=1; j<arr.length; j++){
//				if(arr[i]>arr[j]){
//					min = -arr[j];
//				}else if(arr[i]<arr[j]){
//					max = arr[j];
//				}
//			}//for
//			
//		}//for
//		System.out.println("가장 큰수 "+max+" 가장 작은수 "+min);
//		System.out.println(max+"-"+min+"="+(max-min));
//		
		

		int arr[] = {40,-20,-30,-10,50};
		int max =Math.abs(arr[0]);
		int min =Math.abs(arr[0]);
		for(int i=0; i<arr.length; i++){
			max =Math.max(max,Math.abs(arr[i]));
			min =Math.min(min,Math.abs(arr[i]));
			}//for
			
		System.out.println("가장 큰수 "+max+" 가장 작은수 "+min);
		System.out.println(max+"-"+min+"="+(max-min));
		
		
	}//main

}
