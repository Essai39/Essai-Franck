package fr.test;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<Integer> nombres = Arrays.asList(1,2,3,4,2,6,8);
		
		nombres.stream()
			.filter(e -> e>3)
			.filter(e -> e % 2 == 0)
			.map(e -> e * 2)
		    .forEach(System.out::println);
		    
											
	}

}
