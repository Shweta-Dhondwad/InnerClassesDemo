package com.innerclassexample;

class SimpleOuter {
	// Simple nested inner class
	class SimpleInner {
		int x = 10;

		public void show() {
			System.out.println("X=" + x);
			System.out.println("In a nested class method");
		}
	}
}

public class NestedInnerClass {
	public static void main(String[] args) {
		SimpleOuter.SimpleInner in = new SimpleOuter().new SimpleInner();
		in.show();
	}
}
