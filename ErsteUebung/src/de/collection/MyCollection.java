package de.collection;

import java.util.function.Consumer;

public class MyCollection {
	
	private final String data [] = {"eins","zwei","drei","vier"};
	private int index = 0;
	
	private final Consumer<String> callback;
	
	public MyCollection(final Consumer<String> callback) {
		this.callback = callback;
	}

	public MyCollection() {
		this(s->{});
	}
	
	public String getActualData() {
		return data[index];
	}
	
	public void next() {
		
		// 
		index ++;
		index %= data.length;
		
		// Callback wird aufgerufen mit aktuellem Wert als Argument Funktionspointer aufrufen
		callback.accept(getActualData());
	}
	
	

}
