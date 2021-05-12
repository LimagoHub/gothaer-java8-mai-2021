package de.demo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class Demo {

	public static void main(String[] args) {
//		Instant start = Instant.now();
//		LocalDateTime ldt = LocalDateTime.now();
//		
//		System.out.println(start);
//		System.out.println(ldt);
//		
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Instant ende = Instant.now();
//		
//		start.isAfter(ende)
//		
//		Duration duration = Duration.between(start, ende);
//		
//		System.out.println(duration.toMillis());
		
		Period p = Period.ofYears(1).withMonths(13).withDays(2);
		System.out.println(p);
		p = Period.of(1,13,2);
		System.out.println(p.normalized());
		
		LocalDateTime ldt = LocalDateTime.now();
		
		ldt = ldt.plus(p);
		
		System.out.println(ldt);
		
		
	}

}
