package de.gothaer;

import java.util.function.Consumer;

public class LamdaDemo {

	public static void main(final String[] args) {
		new LamdaDemo().go();

	}

	private void go() {

		final Runnable runnable = ()->{System.out.println("Mein erster LamdaAusdruck");};  // Lokale Methode, anonym
		final Runnable r2 = this::anonym;
		
		runnable.run();
		r2.run();
		
		//Consumer<String> consumer = (String a)->{System.out.println(a);};
		
		final Consumer<String> consumer = a->System.out.println(a);
		
		consumer.accept("xxxxx");
		
	}
	
	private void anonym() {}; // Modulglobale Methode, hat Name
	
	private void anonym2(final String a) {
		System.out.println(a);
	};
}
