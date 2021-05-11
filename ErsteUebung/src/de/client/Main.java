package de.client;

import de.collection.MyCollection;

public class Main {

	public static void main(final String[] args) {
		final MyCollection col = new MyCollection(/* Callback Funktionspointer*/);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(col.getActualData());
			col.next();
			
		}
	}

}
