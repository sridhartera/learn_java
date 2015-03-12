package com.company;

public class MethodsTest {

	public static void main (String[] args){
		Methods m1 = new Methods();
		m1.setProperty("prop1");
		System.out.println(m1.getProperty());
		MethodsNew mn = new MethodsNew();
		mn.test();
	}
}
