package de.client;

import de.collection.MyCollection;

public class Main {

	public static void main(final String[] args) {
		final MyCollection col = new MyCollection(System.out::println);
		
		
		for (int i = 0; i < 10; i++) {
			col.next();
			
		}
	}

}
