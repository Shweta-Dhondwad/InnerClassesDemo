package com.innerclassexample;

class OuterClass {
	static int sum = 50;

	private static void outerMethod() {
		System.out.println("inside outerclass Method");
	}

	// A static inner class
	static class StaticInnerClass {
		public static void main(String[] args) {
			System.out.println("inside static inner class Method");
			System.out.println("Sum=" + sum);
			outerMethod();
		}
	}

}
