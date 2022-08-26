package n3ejercicio6;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOutException {

	public static void main(String[] args) {
		int numeros[] = { 1, 2, 3, 4 };
		int i = 4;
		AssertException(i, numeros.length);
		try {
			System.out.println(numeros[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

	}

	public static void AssertException(int size, int index) {
		assert (size < index) : "Error";
		// run>configurations>arguments>VMargumets: -ea
	}
}
