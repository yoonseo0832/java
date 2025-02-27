package com.kh.practice.numRange.exception;

public class NumRangeException extends Exception{
	public NumRangeException() {
		super("오류 발생: 1부터 100 사이의 값이 아니다!");
	}
	
	public NumRangeException(String message) {
		super(message);
	}
}
