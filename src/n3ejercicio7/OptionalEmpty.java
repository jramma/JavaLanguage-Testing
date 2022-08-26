package n3ejercicio7;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

public class OptionalEmpty {

	public static void main(String[] args) {
		Optional objeto = java.util.Optional.empty();
		
	assertEquals("El optional no está vacío",Optional.empty(), objeto);	
		System.out.println("El optional está vacío");
		
	}
	
}
