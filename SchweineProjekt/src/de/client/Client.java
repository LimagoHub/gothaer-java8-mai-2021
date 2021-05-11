package de.client;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import de.tiere.Schwein;

public class Client {

	public static void main(final String[] args) {
		
		final Comparator<Schwein> c = new Comparator<Schwein>() {

			@Override
			public int compare(final Schwein o1, final Schwein o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		
		final Set<Schwein> mySet = new TreeSet<>( c);
		
		mySet.add(new Schwein("Eins", 10));
		mySet.add(new Schwein("Zwei", 18));
		mySet.add(new Schwein("Eins", 11));
		mySet.add(new Schwein("Drei", 12));
		mySet.add(new Schwein("Eins", 8));
		mySet.add(new Schwein("Vier", 13));
		//mySet.add(null);
		
		mySet.forEach(System.out::println);

	}

}
