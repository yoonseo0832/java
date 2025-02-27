package com.kh.practice.abstracted.run;
import com.kh.practice.abstracted.controller.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		
		for(String s: result) {
			System.out.print(s);
			
		}
		
	}

}
