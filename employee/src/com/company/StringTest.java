package com.company;

public class StringTest {

	/**
	 * object stores on heap and string literal stores on scp (string constant pool)
	 */
	public static void main(String[] args) {
		String s1 = new String("Tera");
		String s2 = new String("Tera");
		String s3 = "Tera";
		String s4 = "Tera";
		
		String s5 = new String("Sridhar");
		String s6 = s5.concat("Tera");
		System.out.println(s6);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s1==s4);
	}

}
