package day9;

import java.util.Calendar;

public class Coll {
	
	public static void  printCalendar(){
		
	}

	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		if(4 < hour && hour < 12){
			System.out.println("Good Morning");			
		}else if(hour < 18){
			System.out.println("Good Afternoon");
		}else if(hour < 22){
			System.out.println("Good Evening");
		}else{
			System.out.println("Good Night");
		}
		
		
	}	
	
}
