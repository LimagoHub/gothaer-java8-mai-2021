package de.gothaer;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(final String[] args) {
		new Main().go();

	}

	private void go() {
		
//		final MFPT pointer = this::sinnDesLebens;
//		
//		final int ergebnis = pointer.doIt();
//		System.out.println(ergebnis);
//		
		
		
		foo();
//		
//		final Runnable runnable = new Runnable() {
//			int x = 0;
//			@Override
//			public void run() {
//				foo();
//				x ++;
//			}
//		};
		
		final Runnable runnable = this::foo;
		
		runnable.run();
		
		final Dozent d = System.out::println;
		
		d.karl("Hallo Welt!");
		
		final Consumer<String> consumer = System.out::println; // Ein Argument kein Rückgabewert -> Consumer
		consumer.accept("Hallo Universum");
		
		final Supplier<Integer> supplier = this::sinnDesLebens;
		
		final int ergebnis = supplier.get();// kein Argument ein Rückgabewert -> Suuplier 
		
		System.out.println(ergebnis);
		
		final Predicate<String> predicate = this::isEmpty;
		
		System.out.println(predicate.test("Hallo"));
		
	}
	
	private int xxx(final String x) {
		return x.length();
	}
	
	private boolean isEmpty(final String value) {
		return value == null || value.length() == 0;
	}
	
	private int sinnDesLebens() {
		return 42;
	}
	
	private void foo() {
		System.out.println("Hier ist foo");
	}
	
	
	interface Dozent {
		void karl(Object o);
	}
	
	
	@FunctionalInterface
	interface MFPT {
		int doIt();
	}

}
