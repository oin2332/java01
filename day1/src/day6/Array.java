package day6;

public class Array implements ArrayInterface {
	// array = {3,5,2,4,1}
	// �迭�� ���� ū ���� ���� ���� ����
	@Override
	public int MaxSubMin(int[] a) {
//		int max = 0;
//		int min = 0; 
		int max = a[0];
		int min = a[0]; 
		// TODO Auto-generated method stub
		for (int i : a) {
			if(i>max){max = i;}
			if(i<min){min = i;}
		}
			
		return max - min;

	}

	// �迭�� ���� ū ���� �� ������ ���� ��ġ �ٲٱ�
	@Override
	public void MaxChange(int[] a) {
		int max = 0;
		// TODO Auto-generated method stub
		for(int i = 1; i < a.length; i++){
			if(a[max]< a[i]){
				max = i;
			}
		}
		int temp =0 ;
		temp = a[max];
		a[max] = a[a.length-1];
		a[a.length-1] = temp;

	}

}
