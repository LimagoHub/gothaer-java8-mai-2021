package de.tiere;

import java.util.Optional;

public class Schwein implements Comparable<Schwein>{
	
	private Optional<String> name;
	private int gewicht;
	
	
	public Schwein() {
		this(Optional.of("nobody"), 10);
	}
	
	public Schwein(final Optional<String> name, final int gewicht) {
		setName(name);
		setGewicht(gewicht);
	}

	
	

	public int getGewicht() {
		return gewicht;
	}




	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}




	public Optional<String> getName() {
		return name;
	}




	public void setName(Optional<String> name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}

	@Override
	public int compareTo(final Schwein other) {
		// TODO Auto-generated method stub
		return gewicht - other.gewicht;
	}

	
	public void fressen() {
		gewicht ++;
	}

}
