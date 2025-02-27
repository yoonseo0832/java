package com.kh.practice.abstracted.controller;
import com.kh.practice.abstracted.model.vo.Phone;
import com.kh.practice.abstracted.model.vo.SmartPhone;
import com.kh.practice.abstracted.model.vo.GalaxyNote9;
import com.kh.practice.abstracted.model.vo.V40;
public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		// 클래스명[] 변수명 = new 클래스명[배열 크기];
		// 클래스명[] 변수명={};
		Phone[] pArr = new Phone[2];
		pArr[0] = new GalaxyNote9();
		pArr[1] = new V40();
		
		for(int i=0; i<pArr.length;i++) {
			//pArr[i].printInformation(); //다운캐스팅 필요
			if(pArr[i] instanceof SmartPhone) {
				result[i] = ((SmartPhone)pArr[i]).printInformation();
			}
		}
		return result;
	}
}

 