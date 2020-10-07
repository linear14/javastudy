package ch08_interface.ex6;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB();
		// ia.methodC();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		// ia.methodA();
		// ia.methodC();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
