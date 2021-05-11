package de.gothaer;

/*
 * Wenn das Interfave genau eine abstrakte methode hat, 
 * dann nennt man es SAM (Single Abstract Methode Interface)
 * 
 * d.h. Es ist ein FunctionalInterface
 * 
 */
@FunctionalInterface
public interface DemoInterface {
	
	double PI = 3.14;
	
	void foo();  // Abstrakte Methode
	
	
	default void bar() {
		System.out.println("Hallo");
	}
	
	static int sinnDesLebens() {
		return 42;
	}

}
