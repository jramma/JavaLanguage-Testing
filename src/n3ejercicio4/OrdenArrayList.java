package n3ejercicio4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

public class OrdenArrayList {

	private static ArrayList<Object> inicial;

	public OrdenArrayList(ArrayList<Object> inicial) {
		this.inicial = inicial;
	}

	public static ArrayList<Object> getInicial() {
		return inicial;
	}

	@Test
	static void NoOrdenInicial(ArrayList<Object> input) {
		assertNotEquals("El orden es el mismo al inicial", inicial, input);
		System.out.println("El orden es distinto al inicial");
	}

	@Test
	static void OrdenInicial(ArrayList<Object> input) {

		assertEquals("El orden es distinto al inicial", inicial, input);

		System.out.println("El orden es el inicial");
	}

	@Test
	static void UnicoYFalta(ArrayList<Object> input) {
		boolean encontrado = false, noExiste=false;
		int i = -1, j = 0;
		while (i < input.size()) {
			i++;
			while (j < input.size()) {
				j++;
				assert (input.get(i).equals(input.get(j))) : "Si que se repite un objeto:" + input.get(j);
			}
			j = 0;
		}
		assertNotEquals("No falta nigún elemento", inicial, input);
		j = 0;
		i = 0;
		while (i < input.size() || encontrado == false || noExiste == false) {
			i++;
			while (j < inicial.size() || encontrado == false) {
				if ((input.get(i).equals(inicial.get(j)))) {
					encontrado = true;
				}
				j++;
				if(j>= inicial.size()) {
					noExiste = true;
					
				}
			}
		}
		System.out.println("Ningún elemento de la array se ha añadido más de una vez y \n" + "falta el elemento: "
				+ i + " respecto la array inicial" ) ;

	}

}
