package n1ejercicio3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Main1 {

		public static void main(String[] args) throws Exception {

			ArrayList<Integer> numeros = new ArrayList<Integer>();
			numeros.add(1);
			numeros.add(2);
			testIndexOutOfBound(numeros);

		}

		@Test
		public static void testIndexOutOfBound(ArrayList<Integer> numeros) throws Exception {
			try {
				numeros.get(2);
				System.out.println("no ha saltado la excepción");
			} catch (Exception e) {
				assertEquals(numeros.size(), 2);
			}
		}

	}
