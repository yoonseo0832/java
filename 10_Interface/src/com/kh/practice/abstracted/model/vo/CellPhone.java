package com.kh.practice.abstracted.model.vo;

public interface CellPhone extends Phone, Camera{
	// CellPhone 인터페이스는 Phone, Camera 인터페이스로부터 상속 받음, 멤버를 물려받아 CellPhone의 멤버가 됨
	
	String charge(); 
	
// => CellPhone NUMBER_PAD 상수, makeCall(), takeCall(), picture(), charge()
}
