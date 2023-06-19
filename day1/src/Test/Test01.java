package Test;

public class Test01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//3의 배수만 출력(3,6,9단)
//		for(int i=1; i<=9; i++){			
//			for(int j=2; j<=9; j++){
//				if(i%3==0){
//					System.out.print(i+"x"+j+"="+i*j+" ");
//				}
//			}//for
//			System.out.println();
//		}
//		
		
		for(int i=3; i<=9; i+=3){			
			for(int j=2; j<=9; j++){
				System.out.print(i+"x"+j+"="+i*j+" ");				
			}//for
			System.out.println();
		}
		

	}

}
