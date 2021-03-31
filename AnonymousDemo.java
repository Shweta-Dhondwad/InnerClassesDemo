package com.innerclassexample;

interface Age {
	int x = 21;

	void getAge();
}

class AnonymousDemo {
	public static void main(String[] args) {
		System.out.println("Using Anonymous Inner class that implements an interface Age");
		Age age = new Age() {
			@Override
			public void getAge() {
				System.out.print("Age is " + x);
			}
		};
		age.getAge();
		System.out.println("\nUsing Anonymous Inner class that extends a Thread Class");
		Thread t = new Thread() {
			public void run() {
				System.out.println("Run Thread");
			}
		};
		t.start();
		System.out.println("Main Thread");
	}

}
