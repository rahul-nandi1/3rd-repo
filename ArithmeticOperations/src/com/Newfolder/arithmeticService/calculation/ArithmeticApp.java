package com.Newfolder.arithmeticService.calculation;
import com.Newfolder.arithmeticService.ArithmeticService;
//import com.Newfolder.arithmeticService.arithmeticServiceImp.ArithmeticService;
import com.Newfolder.arithmeticService.arithmeticServiceImp.ArithmeticServiceImp;

public class ArithmeticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticService obj = new ArithmeticServiceImp();
		int resultvalue1 = obj.add(10,20);
		int resultvalue2 = obj.sub(35,20);
		int resultvalue3 = obj.multiply(25,20);
		
		System.out.println("The addition of two numbers is: " +resultvalue1);
		System.out.println("The subtraction of two numbers is: " +resultvalue2);
		System.out.println("The multiplication of two numbers is: " +resultvalue3);

	}

}
