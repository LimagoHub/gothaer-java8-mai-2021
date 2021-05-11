package de.collection;

public class MyCollection {
	
	private final String data [] = {"eins","zwei","drei","vier"};
	private int index = 0;
	
	
	public String getActualData() {
		return data[index];
	}
	
	public void next() {
		
		// 
		index ++;
		index %= data.length;
		
		// Callback wird aufgerufen mit aktuellem Wert als Argument
	}
	
	

}
