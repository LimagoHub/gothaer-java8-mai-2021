package de.gothaer;

import java.util.function.Consumer;

public class LamdaDemo {

	public static void main(final String[] args) {
		new LamdaDemo().go();

	}

	private void go() {

		Consumer<String> c = foo();
		
		c.accept("Hallo ");
		
	}

	private Consumer<String> foo() {
		final int x = 10;
		
		final Consumer<String> consumer = s->System.out.println(s + x);
		
		return consumer;
		
	}
	
	
}
