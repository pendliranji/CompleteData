package com.app;

public class Test {

	int i;
	void test() {
		i=1;
		System.out.println(i);
		
}
	
	void tesat() {
		i=45;
		System.out.println(i);
		
}
	
	public static void main(String[] args) {
		new Test().test();
		new Test().tesat();
	}
}
