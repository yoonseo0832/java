package com.kh.practice.leap.veiw;

import java.util.Calendar;
import com.kh.practice.leap.controller.LeapController;
public class LeapView {
	public LeapView() {
		LeapController lc = new LeapController();
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		lc.isLeapYear(year);
		
		String result="";
		if(lc.isLeapYear(year)==false) {
			result ="평년";
		}else {
			result ="윤년";
		}
		
		System.out.println(year+"년은 "+result+"입니다.");
		System.out.println("총 날짜 수: "+ lc.leapDate(today)+"일");
	
	}
}
