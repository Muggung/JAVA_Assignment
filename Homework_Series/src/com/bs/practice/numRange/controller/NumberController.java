package com.bs.practice.numRange.controller;

import com.bs.practice.numRange.exception.NumRangException;

public class NumberController {
	
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumRangException {
		if(num1 > 100 || num2 > 100) {
			throw new NumRangException("1부터 100 사이의 값이 아닙니다.");
		} else if(!(num1 % num2 == 0)) {
			return false;
		} else if(num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
