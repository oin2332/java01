package day3;

public class Calc {
	void sum() {
		System.out.println("void sum È£Ãâ");
	}

	// ------------------
	int sum2(int a, int b) {
		int c = a + b;
		return c;
	}
	
	// --------------
	int max(int a, int b) {

		return (a >= b) ? a : b;
	}
	// ---------------
	int aa(int a) {
		if (a >= 0) {
			return a;
		} else {
			return -a;
		}
	}

	// -------------------/
	int min(int a, int b) {
		return (a >= b) ? b : a;
	}

	// ---------------------
	int min(int a, int b, int c) {
		return (min(a, b) >= c) ? c : min(a, b);

	}

	// -----------
	double sum2(double a, double b) {
		return a + b;
	}

	// --------------
	int arrmax(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			max = Math.max(max, num);
		}
		return max;
	}

	// --------------------------
	double arrAvg(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return (double)sum/arr.length;
	}
//------------
	void test1(int a){
		a = a+1;
	}
	void test2(int[] arr){
		arr[0] = 100;
	}
	
	

}// class
