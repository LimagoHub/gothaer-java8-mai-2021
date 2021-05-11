package de.gothaer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(final String[] args) {
		new Main().go();

	}

	private void go() {
		final List<String> strings = Arrays.asList("eins","zwei","drei","vier");
		
		final Consumer<String> consumer = System.out::println;
		
		strings.forEach(consumer);
		
		System.out.println("gggga");
	}
}