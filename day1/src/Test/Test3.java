package Test;

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 {40, -20, -30, -10, 50}���� ���� ū ����
		// ���� ���� ���� ���� ���ϱ� 
		// �� ������ ���� ��
		//(ex, ���� ū�� : 50, ���� ������ : -10,��� 40)
		
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
//		System.out.println("���� ū�� "+max+" ���� ������ "+min);
//		System.out.println(max+"-"+min+"="+(max-min));
//		
		

		int arr[] = {40,-20,-30,-10,50};
		int max =Math.abs(arr[0]);
		int min =Math.abs(arr[0]);
		for(int i=0; i<arr.length; i++){
			max =Math.max(max,Math.abs(arr[i]));
			min =Math.min(min,Math.abs(arr[i]));
			}//for
			
		System.out.println("���� ū�� "+max+" ���� ������ "+min);
		System.out.println(max+"-"+min+"="+(max-min));
		
		
	}//main

}
