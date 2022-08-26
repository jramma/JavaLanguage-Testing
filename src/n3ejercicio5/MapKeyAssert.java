package n3ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapKeyAssert {
	public static void main(String[] args) {
		HashMap<Integer, String> meses = new HashMap<Integer, String>();

		meses.put(1, "marzo");
		meses.put(2, "febrero");
		meses.put(3, "marzo");
		meses.put(4, "abril");
		meses.put(5, "mayo");
		meses.put(6, "junio");
		meses.put(7, "julio");
		meses.put(8, "agosto");
		meses.put(9, "septiembre");
		meses.put(10, "octubre");
		meses.put(11, "noviembre");
		meses.put(12, "diciembre");

		System.out.println(meses.values());
		System.out.println(meses.get(1));
		KeyMatchValue(meses);
	}

	@Test
	static void KeyMatchValue(HashMap<Integer, String> input) {
		assertEquals("El valor 'enero' no coincide", input.get(1), "enero");
	}

}
