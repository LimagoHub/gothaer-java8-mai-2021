package demo;

import java.util.Optional;

import de.tiere.Schwein;

public class Main {

	private void go() {
		
		Schwein piggy = new Schwein(Optional.of("Miss Piggy"), 10);
		//Schwein piggy = new Schwein(Optional.empty(), 10);
		
		//Optional<Schwein> piggyOptional = Optional.of(piggy);
		Optional<Schwein> piggyOptional = Optional.empty();
		
		String p = piggyOptional.orElse(new Schwein()).getName().orElse("Fritz");
		
		
		
		
		System.out.println(p);
		
	}


	public static void main(String[] args) {
		new Main().go();
	}
	
	Optional<String> findbyId(int id) {
		return Optional.of("treffer");
	}
	
	
	String convert(String s) {
		return s.toUpperCase();
	}
	
	class X {
		
		public Optional<String> s = Optional.of("Welt");
	}

}
