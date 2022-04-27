package com.Newfolder.arithmeticService.arithmeticServiceImp;
import com.Newfolder.arithmeticService.ArithmeticService;
//import com.Newfolder.arithmeticService.ArimaticApp;

public class ArithmeticServiceImp implements ArithmeticService {
	
	@Override
	public int add(int a, int b) {
		int addResult = a + b;
		return addResult;
	}
	
	public int sub(int a, int b) {
		int subResult = a - b;
		return subResult;
	}
	
	public int multiply(int a, int b) {
		int multiplyResult = a * b;
		return multiplyResult;
	}
	
}
