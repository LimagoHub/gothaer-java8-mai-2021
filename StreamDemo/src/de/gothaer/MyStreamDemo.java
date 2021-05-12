package de.gothaer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import de.tiere.Schwein;

public class MyStreamDemo {
	
	public static void main(String[] args) {
		
		
//		List<String> values = Arrays.asList("eins","zwei","drei","vier");
//		
//		Stream<String> myStream = values.stream();
//		
//		
//		long anzahl = myStream
//		.filter(s->s.endsWith("ei"))
//		.map(s->s.toUpperCase())
//		.collect(Collectors.counting()).longValue();
//		//.collect(Collectors.toList());
//		
//		System.out.println(anzahl);
		
		Stream<Schwein> schweineStream = Stream.of(
				new Schwein("Eins", 10),
				new Schwein("Zwei", 10),
				new Schwein("Eins", 11),
				new Schwein("Eins", 12),
				new Schwein("Drei", 10),
				new Schwein("Zwei", 12),
				new Schwein("Drei", 10)
		);
		
//		Map<String, Integer> ergebnis = schweineStream
//		.map(s->s.fressen())
//		
//		.collect(groupingBy(Schwein::getName, summingInt(Schwein::getGewicht)));
//		ergebnis.forEach((key, value)-> System.out.printf("Summe von %s ist %s\n", key, value));
		
		//int summe  = schweineStream.mapToInt(s->s.getGewicht()).sum();
		int summe  = schweineStream.parallel().mapToInt(Schwein::getGewicht).sequential().max().getAsInt();
		System.out.println(summe);
	}
	
	private static boolean isPrime(int possiblePrime) {
		for(int teiler = 2 ; teiler <= possiblePrime / 2; teiler ++) {
			if(possiblePrime % teiler == 0) return false;
		}
		return true;
	}

}
