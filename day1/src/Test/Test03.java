package Test;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭(10,-20,30,40,50,)�� ������ ������ ��� �� ���ϱ�
		int arr[] = { 10, -20, 30, 40, 50 };
		double sum = 0;
		int cnt = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > 0) {
//				sum += a[i];
//			}
//
//		}// for
//
//		System.out.println(aa);

		
		
		for(int num : arr){
			if(num >= 0){
			sum+=num;
			cnt++;
			}
		}
		System.out.println(sum/cnt);
		
		
		
		
		
		
		
		
	}

}
