package com.company;
class Test {	//super class
	int x =16;
	public void demo(){
		int y =10;
		System.out.println("variable from super class:"+ y);
	}
	public final void demo2(){
		int zz = 101;
		System.out.println("pront from super demo2:"+ zz);
		
		
	}
}
public class InheritEx extends Test{ //inherit properties of super class
	int x =20; //global to this class
	public void display (){
		int x =30; //overrides global variable
		System.out.println("print local variable x:" + x);
		System.out.println("print super variable x:" + super.x);
		
		super.demo();
		
		InheritEx ex = new InheritEx();
		ex.demo(); //test by commenting demo method below
		
	}
	public void demo(){  //overrides superclass method
		int z = 100;
		System.out.println("print from local demo method:"+ z);
	}
	public static void main (String args[]){
		InheritEx ie = new InheritEx();
		ie.display();
		System.out.println("print global variable for this class:"+ ie.x);
		
		ie.demo(); 
		ie.demo2();
		//access super class method using superclass object
		Test tt = new Test();
		tt.demo();
		
		
		
	}

}
