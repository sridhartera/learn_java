package com.company;

public class Employee {
	
	static int k = 10;
	int j = 200;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display(){
		int m =20;
		System.out.println("Local variable:"+ m);
		System.out.println("Static Global variable in non-static method: k"+k);
		System.out.println("non-static Global variable in non-static method j:"+j);
					
	}
	public static void display2(){
		int n = 30;
		Employee e2 = new Employee();
		System.out.println("Local to method2:"+n);
		System.out.println("Static global variable in static method2 k:"+k);
		System.out.println("non-static global variable in static method2 j: "+ e2.j);
	}
	public static void main (String args[]){
		Employee e1 = new Employee();
		//k =100;		
		System.out.println("Static Global variable in Main k:"+ k);
		System.out.println("Global variable in Main j:"+ e1.j);
		e1.display();
		display2();
		e1.setName("tera");
		System.out.println("print string:"+e1.getName());
		
		
	}

}
