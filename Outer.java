package com.innerclassexample;

public class Outer {

	private void getValue() {
		int x = 20;
		class LocalInnerClass {
			public int divisor;
			public int remainder;
			int sum = 80;

			public LocalInnerClass() {
				divisor = 4;
				remainder = x % divisor;
			}

			private int getDivisor() {
				return divisor;
			}

			private int getRemainder() {
				return remainder;
			}

			private int getQuotient() {
				return x / divisor;
			}
		}
		LocalInnerClass l = new LocalInnerClass();
		System.out.println("----Local Inner class----");
		System.out.println("Sum = " + l.sum);
		System.out.println("Divisor = " + l.getDivisor());
		System.out.println("Remainder = " + l.getRemainder());
		System.out.println("Quotient = " + l.getQuotient());

	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.getValue();
	}

}
