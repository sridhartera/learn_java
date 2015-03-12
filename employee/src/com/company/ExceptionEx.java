package com.company;

public class ExceptionEx {
	/**
	 * @author Sridhar Tera
	 */
	
	public static void main (String args[]){
		int a=5, b=0, c;
		System.out.println("hello");
		try{
		c=a/b;
		System.out.println(c);
		}
		catch (ArithmeticException e){
//			System.out.println("Div by zero:  " +e);
			e.getMessage();
			e.printStackTrace();
			
		}
		
		System.out.println("hello2");
		
	}

}
