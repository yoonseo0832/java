package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
			 throw new NumRangeException();
		}
		return (num1 % num2 ==0);
	}
}
